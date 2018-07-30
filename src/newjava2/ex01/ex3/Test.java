package newjava2.ex01.ex3;


/**
 * 3.	创建圆形类，创建实例变量半径，创建类变量PI，并为PI赋初始值3.14
 * 创建求周长的方法，求面积的方法。要求将计算的结构返回给调用方法。
 * 创建2个圆形，半径分别为10和20，分别调用求周长和求面积的方法，计算出两个圆形的周长和面积。
 * 最后用System.out对象分别打印周长和面积。
 */
public class Test {

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();

		circle1.r = 10;
		circle2.r = 20;

		//Math.floor()
		System.out.println( "圆的半径是：" + circle1.r + ", 圆的周长是："
				+ Math.floor( circle1.getPerimeter() ) + "，圆的面积是：" + circle1.getArea() );
		System.out.println( "圆的半径是：" + circle2.r + ", 圆的周长是："
				+ Math.round( circle2.getPerimeter() ) + "，圆的面积是：" + circle2.getArea() );

	}
}
