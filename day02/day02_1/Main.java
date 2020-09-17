package day02_1;
//【作业一】
//考察知识点：创建类，使用对象
//
//要求：
//1）定义一个交通工具Vehicle类，类中包含：
//属性：速度(speed)、体积(size)
//方法：加速speedUp(), 减速speedDown()，方法中控制台输出字符串“加速”/“减速”即可
//2）编写测试类Main, main方法中实例化Vehicle对象，为所有属性赋值并输出，最后调用加速，减速方法。
public class Main {
	public static void main(String[] args) {
		Vehicle testVehicle = new Vehicle();
		testVehicle.setSize(5);
		testVehicle.setSpeed(10);
		System.out.println(testVehicle.getSize());
		System.out.println(testVehicle.getSpeed());
		int a = testVehicle.speedUp(testVehicle.getSpeed());
		System.out.println(a);
		int b = testVehicle.speedDown(a);
		System.out.println(b);
		
	}
}
