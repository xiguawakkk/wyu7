package day02_1;
//����ҵһ��
//����֪ʶ�㣺�����࣬ʹ�ö���
//
//Ҫ��
//1������һ����ͨ����Vehicle�࣬���а�����
//���ԣ��ٶ�(speed)�����(size)
//����������speedUp(), ����speedDown()�������п���̨����ַ��������١�/�����١�����
//2����д������Main, main������ʵ����Vehicle����Ϊ�������Ը�ֵ������������ü��٣����ٷ�����
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
