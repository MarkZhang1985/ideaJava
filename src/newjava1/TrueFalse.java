package newjava1;

/**
 * 4.	输出 10 > 9的结果，要求输出第一次输出true，第二次输出false
 */
public class TrueFalse {

	public static void main(String[] args) {

		int a = 9, b = 10;
		System.out.println("比较：" + a + ">" + b);
		System.out.println("第一次输出：" + (a > b ? false : true));
		System.out.println("第二次输出：" + (a > b ? true : false));
	}
}
