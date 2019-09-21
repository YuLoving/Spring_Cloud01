package cn.cqq.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import cn.ccq.pojo.Dept;
import cn.cqq.springcloud.service.DeptService;

/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@RestController
public class DeptController {
	@Autowired
	private DeptService service;
	
	@Autowired
	private DiscoveryClient client;
	
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept)
	  {
	return service.add(dept);
	  }
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id)
	  {
	return service.get(id);
	  }
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list()
	  {
	return service.list();
	  }
	
	/**
	 * 因为该工程作为微服务已经注册到了eureka,所以通过一下配置，让消费端可以通过eureka来发现获取服务
	 * @return
	 */
	 @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	  public Object discovery()
	  {
	    List<String> list = client.getServices();//可以获取到eureka上面有多少个微服务
	    System.out.println("**********" + list);
	 
	    List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");//找到叫做MICROSERVICECLOUD-DEPT的微服务
	    for (ServiceInstance element : srvList) {
	    	//遍历取到MICROSERVICECLOUD-DEPT的微服务的所有接口服务
	     System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
	         + element.getUri());
	    }
	    return this.client;
	  }


}
