package day02_2;

//����ҵ����
//����֪ʶ�㣺���캯��,��������
//
//Ҫ��
//��дJava����������ʾ�˵����������䡣 
//1������һ��Person�࣬������Ӧ��������˽�����ԣ�����(name)������(age)���Լ��Ա�(gender)��
//2�����岻ͬ�����б�Ĺ��췽������ʼ��������̨��ӡ�����
//4)��д������Main,��main�����и��ݲ�ͬ���صĹ��췽�����ֱ𴴽�Person���ʵ��
public class Persion {
	private String nameString;
	private int age;
	private String genderString;
	
	public  Persion(int age) {
		this.age = age;
		System.out.println(age);
	}
	
	public Persion(String nameString) {
		System.out.println(nameString);;
	}
	
	public Persion() {
		super();
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	} 
		
	
}