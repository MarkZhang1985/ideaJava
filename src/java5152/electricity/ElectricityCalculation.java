package java5152.electricity;

public abstract class ElectricityCalculation {

	//电压 = 电流 * 电阻
	public static double vol(double ec, double res){
		return ec * res;
	}
	//电功率 = 电压 * 电流
    //	     = 电流的平方 * 电阻

	public static double ep(double ec, double res){
		return Math.pow( ec, 2 ) * ec;
	}
}
