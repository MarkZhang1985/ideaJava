package newjava1;

/**
 * 3.	声明两个字符ch1，ch2，并给ch1赋值88，给ch2赋值Y，通过+运算后，输出结果’XY’
 */
public class XY {

	public static void main(String[] args) {

		char ch1 = 88, ch2 = 'Y';
		int ch = ch1 + ch2;
		System.out.println("ch1：" + (int)ch1 + "，ch2：" + ch2);
		System.out.print("两者之和是：");
		System.out.println("" + ch1 + ch2);

	}
}
