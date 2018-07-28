package java5152.college;

/**
 * Graduate类，继承Student类，实现接口Salary
 */
public class Graduate extends Student implements Salary {

	private int salary = 1500; // 研究生获得工资1500


	public Graduate(String name) {
		super( name );
	}

	@Override
	public int getFee() {
		return super.fee;
	}

	@Override
	public void setFee(int fee) {
		super.fee= fee;
	}

	@Override
	public int getSalary() {
		return this.salary;
	}

	public boolean isLoan() {
		return this.salary < super.fee  ? true : false;
	}
}
