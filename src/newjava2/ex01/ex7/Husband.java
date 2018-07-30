package newjava2.ex01.ex7;

/**
 * 7.	创建一个丈夫类，实例变量name、age，创建一个妻子类，实例变量name、age，
 * 并在丈夫类中创建一个妻子类型的实例变量。并为丈夫类中的妻子赋值，并打印丈夫的全部属性。
 */
public class Husband {

	private String name;
	private int age;
	private Wife wife;

	public Husband(String name, int age, Wife wife) {
		this.name = name;
		this.age = age;
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband{" +
				"name='" + name + '\'' +
				", age=" + age +
				", wife=" + wife.toString() +
				'}';
	}

	public static void main(String[] args) {

		Husband husband = new Husband( "张三年", 30, new Wife( "王小花", 25 ) );

		System.out.println(husband.toString());
	}
}
