/**
  * @author 作者 :ZTY
  * @version 创建时间:2019年9月21日 下午2:27:52
  *  类说明:
 */
package cn.ccq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dell
 *
 */
@RestController
public class ConfigClientRest {
 
  @Value("${spring.application.name}")
  private String applicationName;
  
  @Value("${eureka.client.service-url.defaultZone}")
  private String eurekaServers;
  
  @Value("${server.port}")
  private String port;
  
  @RequestMapping("/config")
  public String getConfig()
  {
   String str = "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;
   System.out.println("******str: "+ str);
   return "applicationName: "+applicationName+"\t eurekaServers:"+eurekaServers+"\t port: "+port;
  }
}

