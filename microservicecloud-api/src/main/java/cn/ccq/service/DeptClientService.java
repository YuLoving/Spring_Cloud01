/**
 * @author 作者 :ZTY
  * @version 创建时间:2019年9月9日 下午4:30:27
  *  类说明:
 */
package cn.ccq.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ccq.pojo.Dept;

/**
 * @author dell
 *
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);

}
