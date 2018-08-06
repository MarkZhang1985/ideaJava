package newjava3.ex.ex1.switchEx;

import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 08:53
 * @Description:
 * 1.    使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
 * 如果想把小写转换为大写，需要使用String对象的toUpperCase()方法。
 * 例子：“aaa”.toUpperCase() 使用System.out.println()输出查看。
 */
public class Function {
	//ex1
	public static String toUpper(String str){
		char[] chars = str.toCharArray();
		String result = null;
		for(char c : chars) {
			switch (c) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
					result += String.valueOf( c ).toUpperCase();
					break;
				default:
					result += String.valueOf( c );

			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("输入字符串：");
		Scanner scanner = new Scanner( System.in );
		if(scanner.hasNextLine()){
			System.out.println( toUpper( scanner.nextLine() ) );
		}
	}
	//输出结果：
	//输入字符串：
	//abcde fghiab cdkljlk
	//nullABCDE fghiAB CDkljlk
}
