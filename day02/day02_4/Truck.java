package day02_4;
//3)编写Truck卡车类继承于Vehicles类 
//a.增加float型成员属性载重(load)
//b.编写构造方法初始化所有成员属性，显示调用父类构造方法
//c.增加成员方法showTruck，在控制台显示卡车的信息
//4)编写测试类Main,在main方法中实例化各类。
public class Truck extends Vehicle {
	private float load;
	public Truck(float load) {
		super();
		this.load = load;
	}
	public void showTruck() {
		System.out.println(load);
	}
	public float getLoad() {
		return load;
	}
	public void setLoad(float load) {
		this.load = load;
	}
}
