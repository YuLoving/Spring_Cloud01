/**
  * @author 作者 :ZTY
  * @version 创建时间:2019年9月17日 下午3:52:05
  *  类说明:
 */
package cn.ccq.service;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.ccq.pojo.Dept;
import feign.hystrix.FallbackFactory;

/**
 * 修改microservicecloud-api工程，
根据已经有的DeptClientService接口新建一个实现了
FallbackFactory接口的类DeptClientServiceFallbackFactory
 *
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{


	@Override
	public DeptClientService create(Throwable cause) {
		
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				
				return null;
			}
			
			@Override
			public Dept get(long id) {
				
				 return new Dept().setDeptno(id)
			               .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
			               .setDb_source("no this database in MySQL");

			}
			
			@Override
			public boolean add(Dept dept) {
				
				return false;
			}
		};
	}

}
