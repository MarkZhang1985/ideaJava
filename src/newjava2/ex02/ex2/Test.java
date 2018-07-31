package newjava2.ex02.ex2;

/**
 * 2.	假设有Car的一个类，其中包含的属性为车名和时速，要求用户创建出兰博基尼车，时速为200公里/小时，
 * 宝马车，时速为160公里/小时，别克车，时速为120公里/每 小时，并分别求得 假设 从A地到B地一共是20000公里，
 * 分别算出兰博基尼车，宝马，别克，需要开多少才能到达目的地，使用构造器！
 */
public class Test {

	public static void main(String[] args) {

		Car lambo = new Car( "兰博基尼", 200 );
		Car bmw = new Car( "宝马", 160 );
		Car buick = new Car( "别克", 120 );

		System.out.println("假设从A地到B地一共是20000公里，");
		System.out.println(lambo.getName()+"需要的时间是："+Math.round((20000/lambo.getSpeed())) + 's');
		System.out.println(bmw.getName()+"需要的时间是："+Math.round((20000/bmw.getSpeed())) + 's');
		System.out.println(buick.getName()+"需要的时间是："+Math.round((20000/buick.getSpeed())) + 's');
	}





}
