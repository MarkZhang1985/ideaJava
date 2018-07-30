package newjava2.ex02.ex1;
/**
 * 1.	创建Hero类，并创建实例属性，姓名、性别、年龄、性别、技能并创建相对应得getter、setter方法。
 * 创建Hero并通过setter方法为属性赋值，通过getter方法获取对象属性并打印,创建toString()方法
 */
public class Test {

	public static void main(String[] args) {

		Hero hero = new Hero();


		hero.setName( "钢铁侠" );
		hero.setGender( "男" );
		hero.setAge( 49 );
		hero.setSkill( "无敌铠甲" );

		System.out.println("姓名：" + hero.getName() + "\n性别：" + hero.getGender()
				+ "\n年龄：" + hero.getAge() + "\n技能：" + hero.getSkill());
		System.out.println(hero.toString());



	}
}
