package newjava2.ex01.ex7;

/**
 * 7.	创建一个丈夫类，实例变量name、age，创建一个妻子类，实例变量name、age，
 * 并在丈夫类中创建一个妻子类型的实例变量。并为丈夫类中的妻子赋值，并打印丈夫的全部属性。
 */
public class Wife {

	private String name;
	private int age;

	public Wife(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Wife{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
