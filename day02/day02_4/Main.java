package day02_4;

public class Main {
	public static void main(String[] args) {
		Car car = new Car(10);
		Vehicle vehicle = new Vehicle();
		Truck truck = new Truck(100);
		car.setBrandString("��˹��");
		car.setColorString("��ɫ");
		System.out.println(car.getBrandString());
		System.out.println(car.getColorString());
		System.out.println(car.getSeats());
		System.out.println(truck.getLoad());
	}
}
