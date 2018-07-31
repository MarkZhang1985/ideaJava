package newjava6.ex2.ex2;

import java.io.*;
import java.util.Scanner;

/**
 * 习题二：键盘输入任意长度，任意行数的文本，如果当输入的是quit或end的时候，则结束输入，
 * 把所有输入的内容，写到自己指定位置的文件内。
 */
public class SimpleInputToFIle {

	public static void main(String[] args) {

		File file = new File( "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex2","input.txt" );
		try {
			file.createNewFile();
			System.out.println("创建文件成功。");

			//下面两种方法都可以

//			FileWriter fw = new FileWriter( file );
//			BufferedWriter bw = new BufferedWriter( fw );

			FileOutputStream fos = new FileOutputStream( file );
			OutputStreamWriter osw = new OutputStreamWriter(fos);//不需要转码
			BufferedWriter bw =new BufferedWriter( osw );


			Scanner scanner = new Scanner( System.in );
			System.out.println("输入任意长度，任意行数的文本，如果当输入的是quit或end的时候，则结束输入。");
			String str;
			a:while(true) {
				while (scanner.hasNextLine()) {
					str = scanner.nextLine();
					if (str.equals( "quit" ) || str.equals( "end" )) {
						System.out.println( "输入结束。" );
						break a;
					}else{
						bw.write( str );
						bw.write( '\n' );
						bw.flush();//很重要
					}

				}
			}
			bw.close();

		} catch (IOException e) {
			System.out.println("无法创建文件。");
		}

	}
}
