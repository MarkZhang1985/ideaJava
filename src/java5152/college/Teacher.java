package java5152.college;

/**
 * 教师类
 */
public class Teacher implements Salary {

	private String name;
	private int salary = 3000; // 教师获得工资1500

	public Teacher(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int getSalary() {
		return this.salary;
	}
}
