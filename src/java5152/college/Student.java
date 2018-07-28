package java5152.college;

/**
 *抽象类Student
 */
public abstract class Student {

	private String name;
	protected int fee;

	public Student(String name) {
		this.name = name;
	}

	public abstract int getFee();
	public abstract void setFee(int fee);

	public String getName() {
		return name;
	}
}
