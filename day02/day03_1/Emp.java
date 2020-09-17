package day03_1;
//1、创建Emp类
//定义私有属性: 
//String name，int age，String gender ，int salary， Date hiredate;//入职时间
// 	定义构造方法，以及属性get,set方法.
// 	定义toString方法，格式如:
//     	姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
// 	定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
// 	实现序列化接口，并定义版本号。




import javax.xml.crypto.Data;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Data hiredate;
	public Emp() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Data getHiredate() {
		return hiredate;
	}
	public void setHiredate(Data hiredate) {
		this.hiredate = hiredate;
	}
// 	定义toString方法，格式如:
// 	姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2020-01-11
//	"[name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
//	+ ", hiredate=" + hiredate + "]";
	public String toString() {
		return "[name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + ", date=" + hiredate + "]";
		
	}
// 	定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。实现序列化接口，并定义版本号。
	public boolean equals(Object obj) {
		Emp persion = (Emp) obj;
		
		if (name == null) {
			if(persion.name != null) {
				return false;
			}
		}else if (!name.equals(persion.name)){
			return false;
		}
		
		if (age != persion.age) {
			return false;
		}
		
		if (gender == null) {
			if(persion.gender == null) {
				return false;
			}
		}else if(!gender.equals(persion.gender)) {
			return false;
		}
		
		if(salary != persion.salary) {
			return false;
		}
		else {
			return true;
		}
	}
}
