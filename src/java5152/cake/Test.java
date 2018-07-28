package java5152.cake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 测试类，输入蛋糕名称，显示蛋糕信息。
 */
public class Test {

	public static void main(String[] args) throws IOException {

		CakeShop cakeShop = new CakeShop();
		String[] cakeName = {"水果", "奶油","芝士", "巧克力"};
		System.out.println("请输入蛋糕名称：（如水果、奶油、芝士，巧克力）");

		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
		String str = bufferedReader.readLine();

		int index = -1;
		for(int i = 0; i < cakeName.length; i++){
			if(str.trim().equals( cakeName[i] )) {
				index = i;
				break;
			}
		}

		switch(index) {
			case 0:
				cakeShop.setCake(new FruitCake());
				cakeShop.show();
				break;
			case 1:
				cakeShop.setCake(new CreamCake());
				cakeShop.show();
				break;
			case 2:
				cakeShop.setCake(new CheeseCake());
				cakeShop.show();
				break;
			case 3:
				cakeShop.setCake(new ChocolateCake());
				cakeShop.show();
				break;

			default:
				System.out.println("没有这个蛋糕！");
		}
	}
}
