package cn.ccq.springcloud.beans;

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
	public RestTemplate getrestTemplate() {
		return new RestTemplate();
	}

}
