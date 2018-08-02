package Zoo;

/**
 * 动物园管理类，实现动物的增删改查
 */
public class ZooManage {

	Zoo zoo = Zoo.getInstance();
	AnimalFactory animalFactory = new AnimalFactory();

	/**
	 *增加动物
	 */
	public void addAnimal(String name){
		System.out.println("\n||动物管理--增加动物||");
		int original = zoo.cage;//获取原始笼子数
		int step = 1;//每次扩容的级数
		if(original == zoo.animalNumber){
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
		}else{
			zoo.animals[zoo.animalNumber] = animal;
			zoo.animalNumber++;
			System.out.println("增加" + name +"成功，现有动物" + zoo.animalNumber + "个");
		}
	}

	/**
	 *删除动物
	 */
	public void deleteAnimal(int num){
		System.out.println("\n《删除动物》");

		//根据输入的序号，删除动物
		if(num>0 && num<=zoo.animalNumber){
			Animal[] animals = new Animal[zoo.animals.length];
			for(int i = 0, j = 0; i<zoo.animalNumber; i++, j++){//i为原来笼子的计数器，j是删除后笼子的计数器
				if(i == (num-1)) i++;
				if(i == zoo.animalNumber)break;//若删除的是最后一位，在之前跳出循环，即不复制最后一位。
				animals[j] = zoo.animals[i];
			}
			zoo.animals = animals;
			zoo.animalNumber --;
			System.out.println("删除" + num +"号动物成功。");
		}else{
			System.out.println("输入动物序号不存在。");
		}
	}

	/**
	 *修改动物
	 */
	public void changeAnimal(int num, String name){
		System.out.println("\n《修改动物》");
		int animalNumber = zoo.animalNumber;
		if(num<0 || num>animalNumber){
			System.out.println("没有这个序号。");
			return ;
		}
		Animal animal = animalFactory.getAnimal( name );
		if(animal != null){
			Animal temp = zoo.animals[num-1];
			zoo.animals[num-1] = animal;
			System.out.println("修改成功，" + num + "号动物由" + temp.getName() + "变更为" + animal.getName());
		}else {
			System.out.println("还没有这种动物。");
		}
	}

	/**
	 *查找动物，按照序号查找
	 */
	public Animal findAnimal(int num){
		System.out.println("\n《查找动物》--按序号：" + num);
		int animalNumber = zoo.animalNumber;
		if(num<0 || num>animalNumber){
			System.out.println("没有这个序号。");
			return null;
		}
		System.out.println(num + "号动物已找到，信息如下：");
		System.out.println(zoo.animals[num-1]);

		return zoo.animals[num-1];
	}

	/**
	 *查找动物，按照名称查找
	 */
	public Animal[] findAnimal(String name){
		System.out.println("\n《查找动物》");
		Animal[] animals = new Animal[zoo.animalNumber];//存入找到的动物
		int result = 0;
			for(int i = 0; i < zoo.animalNumber; i++) {
				if(name.equals( zoo.animals[i].getName() )){
					animals[result] = zoo.animals[i];
					result++;
				}
			}
		if(result > 0) {
			System.out.println(name + "已经找到，有" + result + "个。");
			return animals;
		} else {
			System.out.println("没有这种动物。");
			return null;
		}
	}

}
