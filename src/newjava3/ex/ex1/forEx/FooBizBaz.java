package newjava3.ex.ex1.forEx;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 14:52
 * @Description:
 * 10.    编写程序FooBizBaz.java，从1循环到150并在每行打印一个值，
 * 另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,
 * 在每个7的倍数行上打印输出“baz”。
 * 1
 * 2
 * 3 foo
 * 4
 * 5 biz
 * 6 foo
 * 7 baz
 * …15 foo biz
 * ….
 * 105 foo biz baz
 * …
 */
public class FooBizBaz {
	public static void main(String[] args) {
		for(int i = 1; i<=150; i++){
			System.out.print(i);
			if(i%3 == 0) System.out.print(" foo");
			if(i%5 == 0) System.out.print(" biz");
			if(i%7 == 0) System.out.print(" baz");
			System.out.println();
		}
	}
}
