package day02_3;
//1)定义一个手机Phone类（放在com.homework包下）,
//类中有如下私有属性，屏幕尺寸（screenSzie），配牌（brand），处理器(cpu)，内存（memory），
//并提供所有成员的getXXX()和setXXX()方法。
//2)编写测试类Main（放在com.test包下）,在main方法创建Phone类的实例，
//为所有成员变量赋值，并且控制台输出所有值。
public class Main {
	public static void main(String[] args) {
		Phone testPhone = new Phone();
		testPhone.setBrandString("小米");
		testPhone.setCpuString("865plus");
		testPhone.setMemoryString("16g+256g");
		testPhone.setScreenSize((float) 5.8);
		System.out.println(testPhone.getBrandString());
		System.out.println(testPhone.getCpuString());
		System.out.println(testPhone.getMemoryString());
		System.out.println(testPhone.getScreenSize());
		
		
	}
}
