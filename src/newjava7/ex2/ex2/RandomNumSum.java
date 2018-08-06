package newjava7.ex2.ex2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 19:54
 * @Description:
 * 第二题：键盘输入一个为M，产生M个，一到M之内的随机数，求随机数集合里有多个这个M的数，
 * 并求出总和，如果无这个M数，则总和输出为0
 */
public class RandomNumSum {

	public static ArrayList makeRandomArray(int num){
		ArrayList arrayList = new ArrayList( num );
		Random random = new Random();
		int temp;
		for( int i = 0; i<num; i++){
			while ( (temp = random.nextInt( num ))!=0 )
				arrayList.add( temp );
		}
		return arrayList;
	}

	public static void main(String[] args) {
		System.out.println("请输入一个正整数：");
		Scanner scanner = new Scanner( System.in );
		if(scanner.hasNextInt()){
			System.out.println(makeRandomArray( scanner.nextInt() ));
		}
	}
}
