package day02_3;
//1)����һ���ֻ�Phone�ࣨ����com.homework���£�,
//����������˽�����ԣ���Ļ�ߴ磨screenSzie�������ƣ�brand����������(cpu)���ڴ棨memory����
//���ṩ���г�Ա��getXXX()��setXXX()������
//2)��д������Main������com.test���£�,��main��������Phone���ʵ����
//Ϊ���г�Ա������ֵ�����ҿ���̨�������ֵ��
public class Main {
	public static void main(String[] args) {
		Phone testPhone = new Phone();
		testPhone.setBrandString("С��");
		testPhone.setCpuString("865plus");
		testPhone.setMemoryString("16g+256g");
		testPhone.setScreenSize((float) 5.8);
		System.out.println(testPhone.getBrandString());
		System.out.println(testPhone.getCpuString());
		System.out.println(testPhone.getMemoryString());
		System.out.println(testPhone.getScreenSize());
		
		
	}
}
