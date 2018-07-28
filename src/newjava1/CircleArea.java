package newjava1;

import java.util.Scanner;

/**
 * 2.	通过Scanner输入圆的半径，求圆的面积。
 */
public class CircleArea {

	public static void main(String[] args) {

		System.out.println("请输入圆的半径：");
		while(true) {
			Scanner scanner = new Scanner( System.in );
			if (scanner.hasNextDouble()) {
				System.out.println( "圆的面积：" + Math.PI * Math.pow( scanner.nextDouble(), 2 ) );
				break;
			} else {
				System.out.println( "输入有误，请重新输入。" );
			}
		}
	}
}
