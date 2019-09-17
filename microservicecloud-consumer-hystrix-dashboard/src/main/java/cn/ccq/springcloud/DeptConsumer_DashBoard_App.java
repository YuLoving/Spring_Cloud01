/**
  * @author 作者 :ZTY
  * @version 创建时间:2019年9月17日 下午4:28:25
  *  类说明:
 */
package cn.ccq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
 
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
  public static void main(String[] args)
  {
   SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
  }
}
 
