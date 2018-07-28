package java01;

public class Calculation {

	public static double add(int a, int b) {
		double result = a + b;
		return result;
	}

	public static double sub(int a, int b) {
		double result = a - b;
		return result;
	}

	public static double mul(int a, int b) {
		double result = a * b;
		return result;
	}

	public static double div(int a, int b) {
		double result = -1;
		if(b == 0)
			System.out.println("除数不能为0！");
		else
			result = (double) a / b;
		return result;
	}
}
