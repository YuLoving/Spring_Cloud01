package cn.cqq.springcloud.service;

import java.util.List;

import cn.ccq.pojo.Dept;

/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
public interface DeptService {
	public boolean add(Dept dept);
	public Dept    get(Long id);
	public List<Dept> list();

}
