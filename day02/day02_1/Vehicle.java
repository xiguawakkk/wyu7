package day02_1;
//����һ����ͨ����Vehicle�࣬���а�����
//���ԣ��ٶ�(speed)�����(size)
//����������speedUp(), ����speedDown()�������п���̨����ַ��������١�/�����١�����
//2����д������Main, main������ʵ����Vehicle����Ϊ�������Ը�ֵ������������ü��٣����ٷ�����
public class Vehicle {
	private int speed;
	private int size;
	
	public int speedUp(int i) {
		System.out.println("���٣�");
		i++;
		return i;
	}
	public int speedDown(int i) {
		System.out.println("���٣�");
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
