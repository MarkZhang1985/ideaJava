package java01;

/**
 * 这是一个测试类，类名为Person，有一个成员变量人名。
 */
class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

/**
 * 这是一个测试类，类名为Dog，有一个成员变量狗名。
 */

class Dog {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 这是主类，创建测试类Person和Dog对象，设置名称，输出结果。
 */
public class Ex3 {


	public static void main(String[] args) {

		Person person = new Person();
		Dog dog = new Dog();
		person.setName("John");
		dog.setName("KiKi");

		System.out.println("Hello, My name is " + person.getName() + ".And my dog is " + dog.getName() + ".");


	}
}
