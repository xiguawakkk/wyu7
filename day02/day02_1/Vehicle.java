package day02_1;
//定义一个交通工具Vehicle类，类中包含：
//属性：速度(speed)、体积(size)
//方法：加速speedUp(), 减速speedDown()，方法中控制台输出字符串“加速”/“减速”即可
//2）编写测试类Main, main方法中实例化Vehicle对象，为所有属性赋值并输出，最后调用加速，减速方法。
public class Vehicle {
	private int speed;
	private int size;
	
	public int speedUp(int i) {
		System.out.println("加速！");
		i++;
		return i;
	}
	public int speedDown(int i) {
		System.out.println("减速！");
		i--;
		return i;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
		
	}
	
	
}
