package newjava2.ex02.ex3;

/**
 * 3.	银行利息的计算公式为：利息=本金×利率×天数， 假设20000元以下的利率是万分之五，
 * 20000到40000元的利率万分之八，40000元以上的利率 是万分之十，分别计算，贷款3000，贷了30天，
 * 本金加利息一共要还多少？ 贷款5万，贷了2年，本金加利息一共要还多少？
 */
public class principalAndInterest {

	private static final double INTEREST_RATE_UNDER_TWENTY_THOUSAND = 0.0005;
	private static final double INTEREST_RATE_BETWEEN_TWENTY_THOUSAND_AND_FORTY_THOUSAND = 0.0008;
	private static final double INTEREST_RATE_UPPER_FORTY_THOUSAND = 0.001;

	public static double calculateInterest(double principal, int day){
		double interestRate = INTEREST_RATE_UNDER_TWENTY_THOUSAND;
		if(principal > 0 ){
			if(principal>=40000)interestRate = INTEREST_RATE_UPPER_FORTY_THOUSAND;
			else if(principal<40000 && principal>20000)interestRate = INTEREST_RATE_BETWEEN_TWENTY_THOUSAND_AND_FORTY_THOUSAND;
		}else {
			System.out.println("本金须大于0。");
			return -1;
		}
		return principal * day * interestRate;
	}
}
