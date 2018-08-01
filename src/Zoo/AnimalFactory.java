package Zoo;

/**
 * 动物工厂类
 */
public class AnimalFactory {

	public Animal getAnimal(String name){

		if(name == null) return null;
		if(name == "老虎")return new Tiger();
		else if(name == "鹰")return new Eagle();

		return null;
	}
}
