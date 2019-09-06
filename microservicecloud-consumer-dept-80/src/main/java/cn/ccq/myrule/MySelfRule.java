
package cn.ccq.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * @author 作者 :ZTY
 * @version 创建时间:2019年9月6日 下午4:58:57
 *  类说明:
*/
@Configuration
public class MySelfRule
{
  @Bean
  public IRule myRule()
  {
   return new RandomRule();//Ribbon默认是轮询，我自定义为随机
  }
}

