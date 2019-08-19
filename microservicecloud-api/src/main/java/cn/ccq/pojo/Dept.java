package cn.ccq.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**  

* <p>Description: 微服务一定要实现序列化接口
* 
* 
* 
* //使用@Accessors(chain = true)的链式编程
    User userChain = new User();
    userChain.setId("1").setName("chain").setAge(1);
* 
* </p>  

* @author ZTY  

* @date 2019年8月8日  

*/
@SuppressWarnings("serial") //去掉序列化的警告
@NoArgsConstructor//无参构造函数
//@AllArgsConstructor   全参构造函数
@Data
@Accessors(chain=true) //setter方法返回的是当前对象，可以实现set的链式写法
public class Dept implements Serializable{
	private Long  deptno;   //主键
	private String  dname;   //部门名称
	private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	//我们选择自定义带参数的构造函数
	
	/**
	 * @param dname
	 */
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
