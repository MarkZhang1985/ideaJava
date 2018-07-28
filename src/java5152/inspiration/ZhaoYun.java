package java5152.inspiration;

public class ZhaoYun {


	public static void main(String[] args) {

		Pocket pocket = new Pocket();

		System.out.println("打开妙计1：");
		pocket.setInspiration(new BackDoor());
		pocket.operator();
		System.out.println("打开妙计2：");
		pocket.setInspiration(new GreenLight());
		pocket.operator();

	}
}
