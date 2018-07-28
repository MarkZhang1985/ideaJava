package java5152.cake;


/**
 * 类名：CakeShop
 * 成员变量：Cake
 * 成员方法：setCake(),show()
 */
public class CakeShop {

	Cake cake;

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public void show(){
		cake.show();
	}
}
