package day03_1;
//1������Emp��
//����˽������: 
//String name��int age��String gender ��int salary�� Date hiredate;//��ְʱ��
// 	���幹�췽�����Լ�����get,set����.
// 	����toString��������ʽ��:
//     	����:����,����:25,�Ա�:��,н��:5000,��ְʱ��:2020-01-11
// 	����equals������Ҫ�����֣����䣬�Ա�н�ʶ���ͬ������Ϊ����һ�¡�
// 	ʵ�����л��ӿڣ�������汾�š�




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
// 	����toString��������ʽ��:
// 	����:����,����:25,�Ա�:��,н��:5000,��ְʱ��:2020-01-11
//	"[name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
//	+ ", hiredate=" + hiredate + "]";
	public String toString() {
		return "[name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + ", date=" + hiredate + "]";
		
	}
// 	����equals������Ҫ�����֣����䣬�Ա�н�ʶ���ͬ������Ϊ����һ�¡�ʵ�����л��ӿڣ�������汾�š�
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
