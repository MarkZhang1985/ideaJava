package java5152.cake;

/**
 * 类名：FruitCake
 * 实现接口：Cake
 * 成员方法：重写接口方法show()
 */
public class FruitCake implements Cake{
	@Override
	public void show() {
		System.out.println("这是水果蛋糕！");
	}
}
