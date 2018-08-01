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
		try(BufferedWriter bw = new BufferedWriter( new FileWriter(file) )) {
			if(file.createNewFile()) System.out.println("创建文件成功。");

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
						bw.newLine();
					}
				}
			}
			bw.flush();//清空缓存，写入文件，没有这句的话，文件不会被保存。

		} catch (IOException e) {
			System.out.println("无法创建文件。");
		}

	}
}
