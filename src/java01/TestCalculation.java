package java01;

public class TestCalculation {

	public static void main(String[] args) {
		int[][] testNumber = { {1, 1}, {2, 100}, {100, 3}, {0, 10}, {10, 0}};

		for(int i = 0; i < testNumber.length; i++) {
			double addResult = Calculation.add(testNumber[i][0], testNumber[i][1]);
			double subResult = Calculation.sub(testNumber[i][0], testNumber[i][1]);
			double mulresult = Calculation.mul(testNumber[i][0], testNumber[i][1]);
			double divResult = Calculation.div(testNumber[i][0], testNumber[i][1]);

			System.out.println(testNumber[i][0] + "与" + testNumber[i][1] + "的和是："
					+ addResult);
			System.out.println(testNumber[i][0] + "与" + testNumber[i][1] + "的差是："
					+ subResult);
			System.out.println(testNumber[i][0] + "与" + testNumber[i][1] + "的积是："
					+ mulresult);
			System.out.println(testNumber[i][0] + "与" + testNumber[i][1] + "的商是："
					+ divResult);
			System.out.println("第" + (i+1) + "轮结束。");
		}
	}
}
