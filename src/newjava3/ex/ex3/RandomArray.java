package newjava3.ex.ex3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 15:36
 * @Description:
 *
 * 2.    创建一个10000长度的整数数组，并使用随机数给其赋值，并打印结果。
 *
 * 3.	输出数组中的最大值、最小值、以及平均值
 *
 * 4.	输出数组中的第二大值，第二小值。
 *
 * 5.	使用冒泡排序法对②生成的数组进行排序。
 *
 * 6.	使用比较排序法对②生成的数组进行排序。
 */
public class RandomArray {

	//冒泡法
	//假设排序是由小到大排序，冒泡算法的主要逻辑是，假设有N个数，游标从第一位数开始，
	// 若左边的数比右边的数大，则左边交换，游标移向下一位直到最后一位。在游标移动过程中，
	// 可以保证，右边的数一定比左边的数大，因为第一轮遍历是要找出最大的数，并且最大的数在最后一位。
	// 同理，要找出第二大的数，重复上述过程，直至找出第N大的数，排序结束。
	// 因此时间复杂度是N*N,空间复杂度是N。
	public int[] bubbleSort(int[] ints){
		//将相邻两数比较，大数后移，一轮过后，数组最后一个元素即为最大值。
		int size = ints.length;//获取数组长度
		int i, j, temp;//i代表轮数，j代表当前比较的元素序号，temp为中转变量
		for(i = 0; i < size - 1; i++) {//最后一个元素无法和下个元素比较
			for (j = 0; j < size - 1 - i; j++) {//每轮比较次数
				if (ints[j] > ints[j + 1]) {//和下一个元素比较，若大于，则交换元素
					temp = ints[j];
					ints[j] = ints[j + 1];
					ints[j + 1] = temp;
				}
			}
		}
		return ints;
	}

	//比较法
	public int[] comparisonSort(int[] ints){
		//每次选出一个最值，与数组第一位交换，第一次将数组第一个作为最值，与下一个作比较
		int size = ints.length;
		int i, j, min, temp;
		for(i = 0; i < size - 1; i++){//最后一个数无法与下一个数比较，共比较size-1次
			min = i;//每轮将首个元素作为最小值
			for(j = i + 1; j < size; j++) {//去除前面已经比较过的元素
				if (ints[min] > ints[j]) min = j;
			}
			if(min != i){//最小值移到循环第一位
				temp = ints[i];
				ints[i] = ints[min];
				ints[min] = temp;
			}
		}
		return ints;
	}

	@Test
	public void test(){
		System.out.println("生成一个随机数组，长度10000");
		Random ra = new Random();
		int[] ints = new int[10];
		for( int i = 0; i < ints.length; i++)ints[i] = ra.nextInt(100);
		System.out.println( Arrays.toString(ints));

		//输出最小值，最大值和平均值
		int min = ints[0], max = ints[0], sum = 0;
		for(int i=0; i<ints.length; i++){
			if(ints[i]<min)min = ints[i];
			if(ints[i]>max)max = ints[i];
			sum += ints[i];
		}
		System.out.println("最小值：" + min);
		System.out.println("最大值：" + max);
		System.out.println("数组的和：" + sum);

		//输出数组中的第二大值，第二小值。
		int secMin = max, secMax = min;
		for(int i=0; i<ints.length; i++){
			if(ints[i] > min && ints[i] < secMin)secMin = ints[i];
			if(ints[i] < max && ints[i] > secMax)secMax = ints[i];
			sum += ints[i];
		}
		System.out.println("第二最小值：" + secMin);
		System.out.println("第二最大值：" + secMax);

		System.out.println("冒泡排序：");
		System.out.println( Arrays.toString( bubbleSort( ints ) ) );
		System.out.println("选择排序：");
		System.out.println( Arrays.toString( comparisonSort( ints ) ) );

	}
}
