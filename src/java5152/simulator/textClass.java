package java5152.simulator;

public class textClass {


	public static void main(String[] args) {

		Simulator simulator = new Simulator();

		AbstractAnimal abstractAnimal = new Dog();
		System.out.println(abstractAnimal.getAnimalName());
		simulator.paySound( abstractAnimal );

		abstractAnimal = new Cat();
		System.out.println(abstractAnimal.getAnimalName());
		simulator.paySound( abstractAnimal );

	}
}
