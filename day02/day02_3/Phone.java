package day02_3;
//1)����һ���ֻ�Phone�ࣨ����com.homework���£�,
//����������˽�����ԣ���Ļ�ߴ磨screenSzie�������ƣ�brand����������(cpu)���ڴ棨memory����
//���ṩ���г�Ա��getXXX()��setXXX()������
//2)��д������Main������com.test���£�,��main��������Phone���ʵ����
//Ϊ���г�Ա������ֵ�����ҿ���̨�������ֵ��
public class Phone {
	private float screenSize;
	private String brandString;
	private String cpuString;
	private String memoryString;
	
	
	
	
	
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	public String getBrandString() {
		return brandString;
	}
	public void setBrandString(String brandString) {
		this.brandString = brandString;
	}
	public String getCpuString() {
		return cpuString;
	}
	public void setCpuString(String cpuString) {
		this.cpuString = cpuString;
	}
	public String getMemoryString() {
		return memoryString;
	}
	public void setMemoryString(String memoryString) {
		this.memoryString = memoryString;
	}
	
	
}
