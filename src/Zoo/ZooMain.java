package Zoo;

/**
 * 动物园测试类
 */
public class ZooMain {

	public static void main(String[] args) {
//		AnimalFactory animalFactory = new AnimalFactory();
//		AbstractAnimal animal = animalFactory.getAnimal( "老虎" );
//		System.out.println(animal.toString());
//		System.out.println();System.out.println();
//		animal = animalFactory.getAnimal( "鹰" );
//		System.out.println(animal.toString());

		Zoo zoo = Zoo.getInstance();
		ZooManage zooManage = new ZooManage();
		zoo.show();
		zooManage.addAnimal( "老虎" );
		zooManage.addAnimal( "鹰" );

		zoo.show();
	}
}
