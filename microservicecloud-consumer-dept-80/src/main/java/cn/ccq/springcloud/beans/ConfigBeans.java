package cn.ccq.springcloud.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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

}
