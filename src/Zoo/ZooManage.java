package Zoo;

/**
 * 动物园管理类，实现动物的增删改查
 */
public class ZooManage {

	Zoo zoo = Zoo.getInstance();
	AnimalFactory animalFactory = new AnimalFactory();

	public boolean addAnimal(String name){
		int original = zoo.cage;//获取原始笼子数
		int step = 1;//每次扩容的级数
		if(original == zoo.animlNumber){
			System.out.println("笼子已满，准备扩容。。。");
			Animal[] animals = new Animal[original + step];
			for(int i = 0; i<original; i++){
				animals[i] = zoo.animals[i];
			}
			zoo.animals = animals;
			zoo.cage = animals.length;
			System.out.println("笼子扩容完毕，原始：" + original + "，扩容后：" + zoo.cage + "，增加：" + step + "。");
		}
		Animal animal = animalFactory.getAnimal( name );
		if(animal == null){
			System.out.println("没有这个动物！");
			return false;
		}
		else{
			animal.toString();
			zoo.animals[zoo.animlNumber] = animal;
			zoo.animlNumber++;
			System.out.println("添加成功，现有动物" + zoo.animlNumber + "个");
			return true;
		}
	}

	public boolean delAnimal(String name){

		return true;

	}
}
