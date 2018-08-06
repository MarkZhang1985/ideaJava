package newjava3.ex.ex1.forEx;

import org.junit.Test;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 14:26
 * @Description:
 * 7.    输入高度，输出直角三角形。如：输入4, 将输出如下图形
 * （一）
 * *
 * * *
 * * * *
 * * * * *
 *
 *
 * （二）
 * * * * *
 * * * *
 * * *
 * *
 * （三）
 * * * * *
 *  * * *
 *   * *
 *    *
 * （四）
 *     *
 *    * *
 *   * * *
 *  * * * *
 */
public class Function {
	//ex1
	public void drawTriangle(int n){
		//第一种三角形
		System.out.println("输出第一种三角形：");
		for(int i = 1; i <=n; i++){
			int j = i;
			while(j>0){
				System.out.print("* ");
				j--;
			}
			System.out.println();
		}

		//第二种三角形
		System.out.println("输出第二种三角形：");
		for(int i = n; i >0; i--){
			int j = i;
			while(j>0){
				System.out.print("* ");
				j--;
			}
			System.out.println();
		}

		//第三种三角形
		System.out.println("输出第三种三角形：");
		for(int i = n; i >0; i--){
			int j = i;
			int k = n - i;
			while(k>0){
				System.out.print(" ");
				k--;
			}
			while(j>0){
				System.out.print("* ");
				j--;
			}
			System.out.println();
		}

		//第四种三角形
		System.out.println("输出第四种三角形：");
		for(int i = 1; i <=n; i++){
			int j = i;
			int k = n - i;
			while(k>0){
				System.out.print(" ");
				k--;
			}
			while(j>0){
				System.out.print("* ");
				j--;
			}
			System.out.println();
		}

	}

	@Test
	public void test(){
		drawTriangle( 4 );
	}
}
