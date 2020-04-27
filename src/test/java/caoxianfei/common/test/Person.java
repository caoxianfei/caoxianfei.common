/**
 * 
 */
package caoxianfei.common.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author (caoxianfei) email:(948315767@qq.com)
 * @version v1.0
 * @date 
 *	  创建于:2020年4月27日上午9:49:32
 */
public class Person {

	private BigInteger id;
	
	private String name;
	 
	private Integer age;             //实体类型  按照 要求建立的对应属性 用来测试 创建对象
	
	private BigDecimal  scope;
	
	private Date date;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getScope() {
		return scope;
	}

	public void setScope(BigDecimal scope) {
		this.scope = scope;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(BigInteger id, String name, Integer age, BigDecimal scope, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.scope = scope;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person id=" + id + ", name=" + name + ", age=" + age + ", scope=" + scope ;
	}
	
	
	
	
	
}
