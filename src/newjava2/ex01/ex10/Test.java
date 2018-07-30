package newjava2.ex01.ex10;

/**
 * 10.	创建妖精类，有名称、类型、级别、血量等类型，并创建口袋类，让口袋类拥有装妖精的能力，
 * 当执行收妖精的静态方法时，就可以把妖精装入口袋。如果口袋不够大，可以自动变大，当变大的操作发生后，
 * 提示口袋升级，以及输出当前口袋能装妖精的总个数，以及目前装了多少只妖怪。创造显示妖精的方法，
 * 通过给定下标来查看当前妖怪的信息。
 */
public class Test {

	public static void main(String[] args) {

		Pocket pocket = new Pocket();

		System.out.println("1、没有加入精灵：当前信息");
		System.out.println(pocket.toString());

		//需要有pocket = ，不然无法保存新口袋
		System.out.println("2、加入一个精灵：当前信息");
		pocket = Spirit.addSpirit( pocket, new Spirit( "皮卡丘", "电系", "10", "800" ));

		System.out.println("3、加入两个精灵：当前信息");
		pocket = Spirit.addSpirit( pocket, new Spirit( "山顶巨人", "土系", "20", "2800" ));

		System.out.println("4、加入三个精灵：当前信息");
		pocket = Spirit.addSpirit( pocket, new Spirit( "巫妖王", "亡灵系", "50", "23400" ));

		System.out.println("5、加入四个精灵：当前信息");
		pocket = Spirit.addSpirit( pocket, new Spirit( "白鲟公主", "童话系", "1", "200" ));

		System.out.println("6、加入五个精灵：当前信息");
		pocket = Spirit.addSpirit( pocket, new Spirit( "Saber", "幻想系", "50", "180000" ));


	}
}
