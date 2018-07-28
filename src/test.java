class Circle {
	static double PI = 3.14159265;
	int radius;
}


public class test {

	public static void main(String[] args) {
//		String s0 ="hello";
//		String s1 = "hello";
//		String s2 = "he" + "llo";
//		System.out.println(s0 ==s1);
//		System.out.println(s0 ==s2);
//
//		int a = (int)9.9;
//		System.out.println("output:");
//		System.out.println('\u0000');
//		System.out.println('\u1122');

				Circle x = new Circle();
				System.out.println(x.PI);
				System.out.println(Circle.PI);
				Circle.PI = 3.14;
				System.out.println(x.PI);
				System.out.println(Circle.PI);

	}


}
