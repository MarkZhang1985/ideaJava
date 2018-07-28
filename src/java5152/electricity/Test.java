package java5152.electricity;

public class Test extends ElectricityCalculation{

	public static void main(String[] args) {

		double ec = 9.9;
		double res = 8.8;

		System.out.println("电流：" + ec + "，电阻：" + res);
		System.out.println("电压为：" + vol( ec,res ));
		System.out.println("电功率为：" + ep( ec,res ));

	}
}
