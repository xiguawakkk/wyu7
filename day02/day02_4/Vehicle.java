package day02_4;
//1)����һ����ͨ����Vehicles�࣬������Ӧ����
//a.String���͵ĳ�Ա�����̱�(brand)����ɫ(color), 
//b.��ӳ�Ա������ʻrun���ڿ���̨��ʾ�����Ѿ�������
//c.��д���췽����ʼ�����г�Ա����
//d.��ӳ�Ա������ʾ������ϢshowInfo���ڿ���̨��ʾ�̱����ɫ��

//2)��дCarС������̳���Vehicles�� 
//a.����int�ͳ�Ա������λ(seats )
//b.��д���췽����ʼ�����г�Ա���ԣ���ʾ���ø��๹�췽��
//c.���ӳ�Ա����showCar,�ڿ���̨��ʾС��������Ϣ

//3)��дTruck������̳���Vehicles�� 
//a.����float�ͳ�Ա��������(load)
//b.��д���췽����ʼ�����г�Ա���ԣ���ʾ���ø��๹�췽��
//c.���ӳ�Ա����showTruck���ڿ���̨��ʾ��������Ϣ
//4)��д������Main,��main������ʵ�������ࡣ
public class Vehicle {
	private String brandString;
	private String colorString ;
	
	public Vehicle () {
		super();
	}
	public void run() {
		System.out.println("���ѿ�����");
		
	}

	public void showInfo() {
		System.out.println(brandString);
		System.out.println(colorString);
	}
	public String getBrandString() {
		return brandString;
	}
	public void setBrandString(String brandString) {
		this.brandString = brandString;
	}
	public String getColorString() {
		return colorString;
	}
	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
}
