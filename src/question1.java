class A{
	static int a = 10;

	public void method(){
		B b = new B();
		methodA(A.a, b);//a?  B.a?
	}

	public void methodA(int a, B b){
		a = 5;
		b.a = 15;
		B b1 = new B();
		b1 = b;
		b1.a = 20;
		//b1.a?    b.a?   a?
	}
}

class B{
	int a = 25;
}

public class question1 {

	public static void main(String[] args) {
		A a = new A();
		a.method();
	}
}
