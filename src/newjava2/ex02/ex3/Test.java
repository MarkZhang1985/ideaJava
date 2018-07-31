package newjava2.ex02.ex3;

/**
 * 3.	银行利息的计算公式为：利息=本金×利率×天数， 假设20000元以下的利率是万分之五，
 * 20000到40000元的利率万分之八，40000元以上的利率 是万分之十，分别计算，贷款3000，贷了30天，
 * 本金加利息一共要还多少？ 贷款5万，贷了2年，本金加利息一共要还多少？
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("贷款3000，贷了30天, 本金加利息一共要还多少？ ");
		System.out.println(principalAndInterest.calculateInterest( 3000,30 ) + 3000 + "元");
		System.out.println("贷款5万，贷了2年, 本金加利息一共要还多少？ ");
		System.out.println(principalAndInterest.calculateInterest( 50000,365*2 ) + 50000 + "元");
	}
}
