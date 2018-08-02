package Zoo;

/**
 * @author zhangkaiming
 *
 */
public class Dolphin extends Animal implements IMove {

	public Dolphin() {
		setName( "海豚" );
		setLegNum( 0 );
	}

	@Override
	public String message() {
		return "海豚是与鲸和鼠海豚密切相关的水生哺乳动物，大约于1千万年前的中新世进化而成，" +
				"广泛生活在大陆架附近的浅海里，偶见于淡水之中。主要以鱼类和软体动物为食。";
	}

	@Override
	public String shout() {
		return "吱吱 啾啾 吱吱 啾啾";
	}


	@Override
	public String run() {
		return "";
	}


	@Override
	public String fly() {
		return "";
	}

	@Override
	public String swim() {
		return "我游的飞快。。";
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
