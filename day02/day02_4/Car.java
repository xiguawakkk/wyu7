package day02_4;

//2)编写Car小汽车类继承于Vehicles类 
//a.增加int型成员属性座位(seats )
//b.编写构造方法初始化所有成员属性，显示调用父类构造方法
//c.增加成员方法showCar,在控制台显示小汽车的信息

public class Car extends Vehicle {
	private int seats;
	public Car (int seats) {
		super();
		this.seats = seats;
	}
	public void showCar() {
		//Vehicle carVehicle = new Vehicle("丰田", "白色 ");
		setBrandString("特斯拉");
		setColorString("白色");
		System.out.println(getColorString());
		System.out.println(getBrandString());
		System.out.println(seats);	
	}
	
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public static void main(String[] args) {
		Car car1 = new Car(10);
		car1.showCar();
		car1.showInfo();
	}
}
