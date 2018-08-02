package Zoo;

/**
 * 动物工厂类
 */
public class AnimalFactory {

	public static final String TIGER = "老虎";
	public static final String EAGLE = "鹰";
	public static final String DOLPHIN  = "海豚";
	public static final String DUCK  = "猴子";

	public Animal getAnimal(String name){

		if(name == null) return null;
		if(name.equals( TIGER ))return new Tiger();
		else if(name.equals( EAGLE ))return new Eagle();
		else if(name.equals( DOLPHIN ))return new Dolphin();

		return null;
	}
}
