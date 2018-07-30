package newjava2.ex01.ex9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9.	创建一个NumberClass类，并创建一个int【】数组，要求建立add方法，可以向数组中插入数字，
 * 当插入数字的长度大于该数组的长度时，进行扩容，并将原数字拷贝到新数组中，初始化长度为2，
 * 每次扩容当前长度的2倍，实现插入8个数方法不报错。
 */
public class NumberClass {

	public int[] arr = new int[2];//初始化数组，长度为2
	private static int index = 0;//当前有效元素个数
	final int MAX_LENGTH = 8; // 数组可接受的最大长度

	public int[] add(int num) {

		int arrLength = this.arr.length;// 获取原始数组的长度

		if (index < arrLength) {//若当前元素个数小于数组长度，则插入数字，index+1
			arr[index] = num;
			index++;
		} else {
			if (arrLength * 2 <= MAX_LENGTH) {//若当前元素个数大于等于数组长度，说明需要扩容，检查扩容后的长度是否符合要求
				int[] newArr = new int[arrLength * 2];
				System.arraycopy( arr, 0, newArr, 0, index ); // 扩容
				arr = newArr;
				arr[index] = num;
				index++;
			}else {//若当前元素个数大于等于数组长度，且无法扩容。
				System.out.println("长度超标！");
				return null;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		NumberClass numberClass = new NumberClass();

		Scanner scan = new Scanner(System.in);
		System.out.println("原始数组：" + Arrays.toString(numberClass.arr));
		System.out.println("请输入1个整数。");
		while(true){
			if( NumberClass.index >= 8){
				System.out.println("数组已经达到最大长度。-->" + numberClass.MAX_LENGTH);
				break;
			}
			if(scan.hasNextInt()){
				numberClass.add( scan.nextInt() );
			}else{
				System.out.println("输入数据格式有误。");
			}
			System.out.println("当前数组为：" + Arrays.toString(numberClass.arr));
		}
	}
}


