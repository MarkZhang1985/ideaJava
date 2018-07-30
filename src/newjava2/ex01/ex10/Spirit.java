package newjava2.ex01.ex10;

/**
 * 10.	创建妖精类，有名称、类型、级别、血量等类型，并创建口袋类，让口袋类拥有装妖精的能力，
 * 当执行收妖精的静态方法时，就可以把妖精装入口袋。如果口袋不够大，可以自动变大，当变大的操作发生后，
 * 提示口袋升级，以及输出当前口袋能装妖精的总个数，以及目前装了多少只妖怪。创造显示妖精的方法，
 * 通过给定下标来查看当前妖怪的信息。
 */
public class Spirit {

	private String name;
	private String type;
	private String level;
	private String hp;

	public Spirit(String name, String type, String level, String hp) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "妖精信息：" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				", level='" + level + '\'' +
				", hp='" + hp + '\'' +
				'}';
	}

	public static Pocket addSpirit(Pocket pocket, Spirit spirit){

		Pocket newPocket = pocket;

		if(pocket.getSpiritNumer() == pocket.getLength()){// 口袋已满
			System.out.println("口袋已满，准备升级口袋。。。");

			int newLength = pocket.getLength() * 2;//新口袋大小为原来的2倍
			System.out.println("新口袋大小"+newLength);

			//转移已有的精灵
			Spirit[] spirits = new Spirit[newLength]; //创建新的数组存精灵
			System.arraycopy( pocket.getSpirits(), 0, spirits, 0, pocket.getSpiritNumer() );//转移原来的精灵
			newPocket = new Pocket(newLength, pocket.getSpiritNumer(), spirits);//初始化新口袋
			System.out.println("升级完毕，新口袋信息如下：");
			System.out.println(newPocket.toString());
		}


		Spirit[] spirits = newPocket.getSpirits();
		//System.arraycopy( pocket.getSpirits(), 0, spirits, 0, pocket.getSpiritNumer() );
		spirits[pocket.getSpiritNumer()] = spirit;
		newPocket.setSpirits( spirits );
		newPocket.setSpiritNumer( pocket.getSpiritNumer() + 1 );

		System.out.println("精灵已被装入口袋，目前口袋信息如下：");
		System.out.println(newPocket.toString());

		System.out.println("-------本轮结束--------");
		return newPocket;
	}

}
