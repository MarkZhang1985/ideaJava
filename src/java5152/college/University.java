package java5152.college;

/**
 * 大学类（University），通过void payOff（Salary s）方法给研究生和教师发放并打印工资。
 */
public class University {

	void payOff(Salary s) {
		System.out.println("本月工资：" + s.getSalary());
	}
}
