package java5152.drive;

public class Test {

	public static void main(String[] args) {

		Driver driver = new Driver();

		System.out.println("老板要叫什么车过来?");
		System.out.println("Benz");
		System.out.println("马上通知司机。");
		driver.setDrive( new Benz() );
		driver.drive();
		System.out.println("车已到达。");
		System.out.println();
		System.out.println("老板要叫什么车过来?");
		System.out.println("Bmw");
		System.out.println("马上通知司机。");
		driver.setDrive( new Bmw() );
		driver.drive();
		System.out.println("车已到达。");
	}
}
