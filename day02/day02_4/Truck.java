package day02_4;
//3)��дTruck������̳���Vehicles�� 
//a.����float�ͳ�Ա��������(load)
//b.��д���췽����ʼ�����г�Ա���ԣ���ʾ���ø��๹�췽��
//c.���ӳ�Ա����showTruck���ڿ���̨��ʾ��������Ϣ
//4)��д������Main,��main������ʵ�������ࡣ
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
