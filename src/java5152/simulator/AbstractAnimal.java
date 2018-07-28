package java5152.simulator;

/**
 * 抽象类：AbstractAnimal
 * 成员变量：animalName
 */
public abstract class AbstractAnimal implements Animal {

	private String animalName;

	public AbstractAnimal(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return this.animalName;
	}

	/**
	 * 此处这样写相当于完成了抽象方法，子类中已经没有强迫实现方法的提示，
	 * 抽象类中的此操作可以减少类与类之间的耦合，但是也断了关联和约束。
	 */

//	@Override
//	public void cry() {
//
//	}
}
