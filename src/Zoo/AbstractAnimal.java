package Zoo;

/**
 * 动物抽象类
 */
public abstract class AbstractAnimal {

	private String name;
	private int legNum;

	public abstract String message();
	public abstract String shout();

	public AbstractAnimal() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegNum() {
		return legNum;
	}

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}


}
