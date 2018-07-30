package newjava2.ex01.ex6;

import java.util.Arrays;

/**
 * 6.	创建电影类，创建成员变量电影名称、电影类别，电影主演人，创建一个show方法，
 * 根据不同的对象打印不同的影片信息。
 */
public class Movie {

	private  String name;
	private  String category;
	private  String[] protagonist;

	public Movie(String name, String category, String[] protagonist) {
		this.name = name;
		this.category = category;
		this.protagonist = protagonist;
	}

	public void show(){
		System.out.println("  电影名：" + name);
		System.out.println("电影类别：" + category);
		System.out.println("    主演：" + Arrays.toString( protagonist ) );
	}

	public static void main(String[] args) {
		Movie movie1 = new Movie( "复仇者联盟", "剧情", new String[]{"小罗伯特·唐尼", "克里斯·埃文斯"} );
		Movie movie2 = new Movie( "冰雪奇缘", "动画", new String[]{"克里斯汀·贝尔", "伊迪娜·门泽尔"} );

		movie1.show();
		System.out.println();
		movie2.show();
	}

}
