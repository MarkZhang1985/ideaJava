package Zoo;

/**
 * 动物类：老虎
 */
public class Tiger extends Animal implements IMove{

	public Tiger() {
		setName( "老虎" );
		setLegNum( 4 );
	}

	@Override
	public String message() {
		return "虎： 大型猫科动物；毛色浅黄或棕黄色，满有黑色横纹；头圆、耳短，耳背面黑色，" +
				"中央有一白斑甚显著；四肢健壮有力；尾粗长。";
	}

	@Override
	public String shout() {
		return "吼吼吼~~~";
	}


	@Override
	public String run() {
		return "我跑的飞快。。";
	}


	@Override
	public String fly() {
		return "";
	}

	@Override
	public String swim() {
		return "";
	}

	@Override
	public String toString() {
		return "名字：" + getName()
				+"\n腿：" + getLegNum()
				+ "\n移动方式：" + run() + fly() + swim()
				+ "\n叫声：" + shout()
				+ "\n简介：" + message();
	}


}
