package day02_3;
//1)定义一个手机Phone类（放在com.homework包下）,
//类中有如下私有属性，屏幕尺寸（screenSzie），配牌（brand），处理器(cpu)，内存（memory），
//并提供所有成员的getXXX()和setXXX()方法。
//2)编写测试类Main（放在com.test包下）,在main方法创建Phone类的实例，
//为所有成员变量赋值，并且控制台输出所有值。
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
