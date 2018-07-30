package newjava2.ex01.ex3;

/**
 * 3.	创建圆形类，创建实例变量半径，创建类变量PI，并为PI赋初始值3.14
 * 创建求周长的方法，求面积的方法。要求将计算的结构返回给调用方法。
 * 创建2个圆形，半径分别为10和20，分别调用求周长和求面积的方法，计算出两个圆形的周长和面积。
 * 最后用System.out对象分别打印周长和面积。
 */
public class Circle {

	public static final double PI = 3.14;

	public double r;

	public double getPerimeter(){
		return PI * r * 2;
	}

	public double getArea(){
		return PI * Math.pow( r, 2 );
	}
}
