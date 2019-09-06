/**
  * @author 作者 :ZTY
  * @version 创建时间:2019年9月5日 下午5:29:26
  *  类说明:
 */
package cn.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dell
 *
 */
@SpringBootApplication
@EnableEurekaServer ////EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7001_App {
		public static void main(String[] args) {
			
			SpringApplication.run(EurekaServer7001_App.class, args);
		}
}
