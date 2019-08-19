package com.ccq.springCloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.ccq.pojo.Dept;

/**  

* <p>Description: Dept对应的mapper </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@Mapper
public interface Deptdao {
	public boolean addDept(Dept dept);
	public Dept findById(Long id);
	public List<Dept> findAll();

}
