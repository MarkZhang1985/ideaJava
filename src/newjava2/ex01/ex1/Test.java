package newjava2.ex01.ex1;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {


		Goods goods1 = new Goods();
		goods1.name = "IphoneX";
		goods1.id = "23425523423423423";
		goods1.price = 9000;
		goods1.createTime = Calendar.getInstance();
		goods1.createTime.set(2018,1,1 );

		Goods goods2 = new Goods();
		goods2.name = "Samsung";
		goods2.id = "d477667854345345";
		goods2.price = 6000;
		goods2.createTime = Calendar.getInstance();
		goods2.createTime.set(2016,5,30 );

		System.out.println(goods1.toString());
		System.out.println("\n");
		System.out.println(goods2.toString());

	}
}
