package newjava2.ex01.ex5;

/**
 * 5.创建学生类，创建成员变量name，age，gender，className自行区分那个成员变量为类变量。
 * 创建2个学生，赋值后，打印2个学生的信息。
 */
public class Student {

	private static String className;

	private String name;
	private int age;
	private String gender;

	public Student() {}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		Student.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "class name：" + className  +
				"\nname=" + name  +
				", age=" + age +
				", gender=" + gender;
	}
}
