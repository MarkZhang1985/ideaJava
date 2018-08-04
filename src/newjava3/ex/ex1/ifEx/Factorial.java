package newjava3.ex.ex1.ifEx;

import org.junit.Test;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/4 17:00
 * @Description:
 * 6.	通过使用递归方法，求10！的阶乘。
 *     7.	通过使用递归方法，输出
 *    *
 *    * *
 *    * * *
 *    * * * *
 */
public class Factorial {

	//ex6
	public Integer factorial(int num){
		if(num == 1)return 1;
		else return num * factorial( num-1 );
	}

	//ex7
	public void factStar(int num){
		if(num == 1) System.out.println("*");
		else {
			for(int i = 0; i<num; i++)
				System.out.print("*");
			System.out.println();
			factStar( num - 1 );
		}
	}

	@Test
	public void test(){
		System.out.println(factorial( 10 ));
		//输出结果：
		//3628800
		factStar( 4 );
	}

}
