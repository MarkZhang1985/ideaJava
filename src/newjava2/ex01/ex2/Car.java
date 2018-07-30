package newjava2.ex01.ex2;

/**
 * 2.	创建Car类，声明实例变量name，color，speed
 * 创建三辆车，分别为宝马，奔驰，兰博基尼，并为三辆车的实例变量赋值。
 * 最后用System.out对象分别打印输出全部信息。
 */
public class Car {

	private String name;
	private String color;
	private double speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
