package newjava1;

import java.util.Scanner;

/**
 * 1.	通过Scanner向java程序中，输入两个值，分别输出两个值得和、差、积、商的结果。
 */
public class TwoNumberCalculation {

	public static double readDouble(){
		while(true) {
			Scanner scanner = new Scanner( System.in );
			if (scanner.hasNextDouble()) {
				return scanner.nextDouble();
			} else {
				System.out.println("数值不正确，请重新输入！");
				//scanner.close(); 为什么加了这句话，就反复执行呢？
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("两个数的四则运算~~~~~~");

		System.out.println( "请输入第一个数：" );
		double inValue1 = readDouble();
		System.out.println( "请输入第二个数：" );
		double inValue2 = readDouble();


		System.out.println("两个数的和是：" + (inValue1 + inValue2) );
		System.out.println("两个数的差是：" + (inValue1 - inValue2) );
		System.out.println("两个数的积是：" + (inValue1 * inValue2) );
		System.out.println("两个数的商是：" + (inValue1 / inValue2) );
	}
}
