package newjava7.ex2.ex2;

import java.util.*;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 19:54
 * @Description:
 * 第二题：键盘输入一个为M，产生M个，一到M之内的随机数，求随机数集合里有多个这个M的数，
 * 并求出总和，如果无这个M数，则总和输出为0
 */
public class RandomNumSum {

	//真随机数组，包含每一个数
	public static List makeRealRandomArray(int num){
		List list = new ArrayList();
		Random random = new Random();
		//效率低，如果数多了的话，会一直随不到这个数
//		for( int i = 0; i<num; i++){
//			while ( (temp = random.nextInt( num ))!=0 )
//				arrayList.add( temp );
//		}
		//生成一个固定长度的数组，元素顺序排列
		for(int i = 1; i <= num; i++)
			list.add( i );
		//System.out.println(origin);
		for(int i = 0; i < num; i++){
			//获取本次循环的下标随机数，范围是数组长度减循环次数
			int index = random.nextInt( num - i );
			//获取随机下标的元素值，赋给list当前循环最后一个位置，并获取其元素值，强转成int
			int temp = (int)list.set( num - i - 1, list.get( index ) );
			//将最后一个元素的值赋给随机下标数
			list.set( index, temp );
		}

		//还有一种最简单的方法
		//Collections.shuffle( list );



		return list;
	}

	//随机数组，数字重复
	public static List makeRandomArray(int num){
		List list = new ArrayList();
		Random random = new Random();

		for(int i = 0; i < num; i++){
			int index = random.nextInt( num );
			list.add( index );
		}

		return list;
	}

	public static void main(String[] args) {
		System.out.println("请输入一个正整数：");
		Scanner scanner = new Scanner( System.in );
		List list;
		int sum = 0;
		int num = -1;
		if(scanner.hasNextInt()){
			num = scanner.nextInt();
			list = makeRandomArray( num );
			System.out.println( list );
			Iterator it = list.iterator();
			while (it.hasNext()){
				if((int)it.next()==num)sum += num;
			}
		}
		System.out.println(num + "出现了" + sum/num + "次，和是" + sum);

	}
}
