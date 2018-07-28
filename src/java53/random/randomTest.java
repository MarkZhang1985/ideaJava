package java53.random;

import java.util.Arrays;

/**
 * 实现数组的真正遍历，即便利每一个元素。
 */
public class randomTest {

	public static void main(String[] args) {

		int length = 10;
		int[] intArray = new int[length];

		for( int i = 0 ; i < length; i++ ){
			intArray[i] = i + 1;
		}
		System.out.println( Arrays.toString(intArray) );

		for( int i = 0 ; i < length; i++ ){
			// Math.random()随机出一个0-1之间的double数
			//首先取第一个数，范围在下标0-9中，用随机数*10，则获得0-9.9999..的数，取int后取得0-9之间的整数
			//第二回合，下标取值范围少一，为0-8，以此类推
			int index = (int)(Math.random() * (length - i));
			System.out.print("  " + intArray[index]);
			//取到第一个下标后，将其和数组最后一个元素交换，下标最后一个位置随次数递减。
			if(intArray[length - 1 - i] != intArray[index]) {
				int temp = intArray[length - 1 - i];
				intArray[length - 1 - i] = intArray[index];
				intArray[index] = temp;
			}
		}
	}

}
