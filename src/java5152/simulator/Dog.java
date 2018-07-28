package java5152.simulator;

public class Dog extends AbstractAnimal {

	/**
	 * 属性既然有了，就可以复用，并不需要重新定义。所以此处声明的animalName多余了
	 * 如果只是在初始化中使用的属性，可以在构造器中赋值，而不用set get方法。
	 */

//	private String animalName = "狗";

	public Dog() { super( "狗" ); }

	@Override
	public void cry() { System.out.println("汪汪汪"); }
}
