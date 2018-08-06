package newjava7.ex2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 19:34
 * @Description:
 * 第一题：随机生成100个1-100以内的随机数，键盘随机输入一个数，求在这100个随机数中，
 * 键盘输入的这个数的位置是多少？如果有多个这个数，则默认显示第一个这个数的位置，
 * 如果随机数内不包输入的这个数，显示“无”
 */
public class SeekNumInArray {

	public void seekNum(int num, ArrayList arrayList){
		if(arrayList.contains( num ))
			System.out.println("数字" + num + "第一次出现在位置" + arrayList.indexOf( num ));
		else
			System.out.println("无");
	}

	@Test
	public void test(){
		System.out.println("生成一个100随机数的数组：");
		Random random = new Random();
		ArrayList arrayList = new ArrayList( 100 );
		for(int i = 0; i < 100; i++)
			arrayList.add( random.nextInt( 100 ) );
		System.out.println(arrayList);
		seekNum( 500, arrayList );


//		生成一个100随机数的数组：
//     [91, 90, 74, 36, 74, 12, 21, 77, 28, 35, 36, 47, 40, 11, 2, 94, 7, 32, 20, 12, 31, 3, 64, 85, 80, 58, 60, 50, 50, 43, 87, 51, 96, 65, 27, 95, 46, 64, 19, 89, 19, 53, 81, 88, 5, 35, 28, 35, 53, 36, 76, 52, 44, 4, 11, 12, 20, 51, 48, 40, 58, 70, 47, 98, 92, 92, 91, 58, 2, 27, 16, 20, 26, 63, 54, 97, 28, 46, 36, 2, 49, 67, 2, 72, 0, 96, 24, 73, 96, 50, 99, 88, 81, 38, 26, 37, 81, 18, 99, 68]
//		数字5第一次出现在位置44

	}
}
