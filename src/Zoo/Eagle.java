package Zoo;

/**
 * 动物类：鹰
 */
public class Eagle extends Animal implements IMove {

	public Eagle() {
		setName( "鹰" );
		setLegNum( 0 );
	}


	@Override
	public String fly() {
		return "我飞的很高。。";
	}


	@Override
	public String run() {
		return "";
	}

	@Override
	public String swim() {
		return "";
	}

	@Override
	public String message() {
		return "广义的鹰(hawk；eagle)泛指小型至中型的白昼活动的隼形类鸟，尤指鹰属(Accipiter)的" +
				"种类(真鹰，true hawk)，包括苍鹰和雀鹰。";
	}

	@Override
	public String shout() {
		return "咯咯咯~~~";
	}


	@Override
	public String toString() {
		return "名字：" + getName()
				+"\n腿：" + getLegNum()
				+ "\n移动方式：" + fly() + run() + swim()
				+ "\n叫声：" + shout()
				+ "\n简介：" + message();
	}
}
