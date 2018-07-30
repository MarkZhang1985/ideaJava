package newjava2.ex01.ex5;

public class Test {

	public static void main(String[] args) {

		Student.setClassName( "三年二班" );

		Student student1 = new Student();
		Student student2 = new Student();

		student1.setName( "张三" );
		student1.setAge( 20 );
		student1.setGender( "男" );

		student2.setName( "李四" );
		student2.setAge( 22 );
		student2.setGender( "女" );

		System.out.println(student1.toString());
		System.out.println(student2.toString());

	}
}
