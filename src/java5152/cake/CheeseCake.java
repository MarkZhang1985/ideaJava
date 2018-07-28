package java5152.cake;

/**
 * 类名：CheeseCake
 * 实现接口：Cake
 * 成员方法：重写接口方法show()
 */
public class CheeseCake implements Cake {
	@Override
	public void show() {
		System.out.println("这是芝士蛋糕！");
	}
}
