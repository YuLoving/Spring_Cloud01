package cn.ccq.springcloud.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@Configuration //注解的作用等同于 spring中的applicationContext.xml
public class ConfigBeans {
	
	@Bean
	@LoadBalanced //Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。该注解就是调接口的时候自动开启负载均衡
	public RestTemplate getrestTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * 如果不申明这个bean,Ribbon的@LoadBalanced自动默认采用轮询算法，
	 * 例子：如果想要改变为随机算法，就要有如下申明
	 * 		Ribbon自带的七个算法：
			 * RoundRobinRule -------- 轮询
			   RandomRule---------------随机
			   AvailabilityFilteringRule-------------会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务， 
										还有并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问
			   WeightedResponseTimeRule---------根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。
			    		刚启动时如果统计信息不足，则使用RoundRobinRule策略，等统计信息足够， 会切换到WeightedResponseTimeRule
			   RetryRule----------先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
			   BestAvailableRule----------------会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
			   ZoneAvoidanceRule----------- 默认规则,复合判断server所在区域的性能和server的可用性选择服务器
	 * @return
	 */
	@Bean
	public IRule myrule() {
		return new RandomRule();
	}
	

}
