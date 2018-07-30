package newjava2.ex01.ex4;

/**
 * 4、创建计算器类，并创建类方法加、减、乘、除。要求每个方法需要两个参数，并且返回结果。
 * 最后通过调用四种方法，计算20 和30两个数的加减乘除的结果，并打印。
 */

public class Calculation {

	public static double add(int a, int b) {
		return (double) (a + b);
	}

	public static double sub(int a, int b) {
		return (double) (a - b);
	}

	public static double mul(int a, int b) {
		return (double) (a * b);
	}

	public static double div(int a, int b) {
		if(b == 0) {
			System.out.println( "除数不能为0！" );
			return -1;
		}
		else
			return (double) a / b;
	}

	public static void main(String[] args) {

		System.out.println( "20 和 30 的四则运算：" + "\n和：" + Calculation.add( 20,30 )
				+ "\n差：" + Calculation.sub( 20,30 )+ "\n积：" + Calculation.mul( 20,30 )
				+ "\n商：" + Calculation.div( 20,30 )
		);
	}

}
