package cn.ccq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;


/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.ccq"})
@ComponentScan("cn.ccq")
public class DeptConsumer80_Feign_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
	
}
