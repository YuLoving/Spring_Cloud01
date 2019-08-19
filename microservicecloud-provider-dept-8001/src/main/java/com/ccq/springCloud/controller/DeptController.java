package com.ccq.springCloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccq.springCloud.service.DeptService;

import cn.ccq.pojo.Dept;

/**  

* <p>Description: </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@RestController
public class DeptController {
	@Autowired
	private DeptService service;
	
	
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

}
