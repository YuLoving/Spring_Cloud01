package cn.ccq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
	
}
