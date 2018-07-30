package newjava2.ex01.ex2;


/**
 * 2.	创建Car类，声明实例变量name，color，speed
 * 创建三辆车，分别为宝马，奔驰，兰博基尼，并为三辆车的实例变量赋值。
 * 最后用System.out对象分别打印输出全部信息。
 */
public class Test {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.setName( "宝马" );
		car1.setColor( "红" );
		car1.setSpeed( 200 );

		car2.setName( "奔驰" );
		car2.setColor( "白" );
		car2.setSpeed( 210 );

		car3.setName( "兰博基尼" );
		car3.setColor( "蓝" );
		car3.setSpeed( 280 );

		System.out.println(
				"名称：" + car1.getName() + ", 颜色：" +car1.getColor() + ", 速度：" + car1.getSpeed()
				+ "\n名称：" + car2.getName() + ", 颜色：" +car2.getColor() + ", 速度：" + car2.getSpeed()
				+ "\n名称：" + car3.getName() + ", 颜色：" +car3.getColor() + ", 速度：" + car3.getSpeed()
		);

	}
}
