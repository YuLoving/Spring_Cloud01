package com.ccq.springCloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccq.springCloud.dao.Deptdao;
import com.ccq.springCloud.service.DeptService;

import cn.ccq.pojo.Dept;

/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private Deptdao dao ;
	
	@Override
	public boolean add(Dept dept)
	  {
	return dao.addDept(dept);
	  }
	@Override
	public Dept get(Long id)
	  {
	return dao.findById(id);
	  }
	@Override
	public List<Dept> list()
	  {
	return dao.findAll();
	  }

}
