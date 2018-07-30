package newjava2.ex02.ex1;

/**
 * 1.	创建Hero类，并创建实例属性，姓名、性别、年龄、性别、技能并创建相对应得getter、setter方法。
 * 创建3个Hero并通过setter方法为属性赋值，通过getter方法获取对象属性并打印,创建toString()方法
 */
public class Hero {

	private String name;
	private String gender;
	private int age;
	private String skill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Hero{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				", skill='" + skill + '\'' +
				'}';
	}
}
