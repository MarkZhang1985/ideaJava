package java5152.simulator;

public class Cat extends AbstractAnimal {


	public Cat(){
		super( "猫" );
	}

	@Override
	public void cry() {
		System.out.println("喵喵喵");
	}

}
