package day02_4;

//2)��дCarС������̳���Vehicles�� 
//a.����int�ͳ�Ա������λ(seats )
//b.��д���췽����ʼ�����г�Ա���ԣ���ʾ���ø��๹�췽��
//c.���ӳ�Ա����showCar,�ڿ���̨��ʾС��������Ϣ

public class Car extends Vehicle {
	private int seats;
	public Car (int seats) {
		super();
		this.seats = seats;
	}
	public void showCar() {
		//Vehicle carVehicle = new Vehicle("����", "��ɫ ");
		setBrandString("��˹��");
		setColorString("��ɫ");
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
