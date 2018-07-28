package java5152.college;

public class Test {

	public static void main(String args[]){
		Graduate g = new Graduate("小亮");
		System.out.print(g.getName() + ",");
		g.setFee(2000);

		University u = new University();
		u.payOff(g);
		System.out.println("是否需要贷款"+ g.isLoan());

		Teacher t = new Teacher("大王");
		System.out.print(t.getName() + ",");
		u.payOff(t);
	}
}
