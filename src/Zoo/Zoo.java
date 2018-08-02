package Zoo;

/**
 * 动物园，单例模式（懒汉式）
 */
public class Zoo {

	private final String CREATE_DATE = "2018年1月1日";
	private String name = "晴朗动物园";
	public int cage = 1;//初始有3个笼子。
	public int animalNumber = 0;//初始没有动物
	public Animal[] animals = new Animal[cage];

	//创建 Zoo 的一个对象
	private static Zoo zoo;

	//让构造函数为 private，这样该类就不会被实例化
	private Zoo(){}

	//获取唯一可用的对象
	public static Zoo getInstance(){
		if(zoo == null)
			zoo =  new Zoo();
		return zoo;
	}

	public void show(){//显示动物园信息
		System.out.println("\n——————————————");
		System.out.println("动物园信息");
		System.out.println("名    称：" + name);
		System.out.println("成立时间：" + CREATE_DATE);
		System.out.println("笼子个数：" + cage );
		System.out.println("动物个数：" + animalNumber);
		System.out.println("动物详细信息如下：");

		if(animalNumber==0) {
			System.out.println("动物园还没有动物。");
			System.out.println("——————————————");
			return;
		}else {
			for (int i = 0; i<animalNumber; i++) {
				System.out.println( "第" + (i+1) + "只  ↓↓↓ ↓↓↓" );
				System.out.println(animals[i]);
				System.out.println();
			}
		}
		System.out.println("——————————————");
	}

	public void showAnimalList(){
		//显示现有动物情况
		if(zoo.animalNumber == 0){
			System.out.println("动物园还没有动物。");
			return;
		}

		for (int i = 0; i<zoo.animalNumber; i++){
			System.out.print((i+1) + "、" + zoo.animals[i].getName() + "    ");
			if((i+1)%5 == 0) System.out.println();//每行显示5个
		}
	}

	public void showSpecies(){
		StringBuffer sb = new StringBuffer();
		String sep =  ",  ";
		sb.append( AnimalFactory.TIGER  + sep);
		sb.append( AnimalFactory.EAGLE  + sep);
		sb.append( AnimalFactory.DOLPHIN );

		System.out.println(sb);

	}

}
