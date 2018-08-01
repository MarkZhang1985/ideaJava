package newjava6.ex2.ex1;

import java.io.*;
import java.util.Scanner;

/**
 * 习题一:用Scanner类在键盘输入一个文件全路径（txt），如果该文件存在,则把文件内容读到控制台里，
 * 如文件不存在，提则用户“您输入的文件不存在”
 */
public class SimpleFileReader {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in );
		String filePath = null;
		System.out.println("请输入一个txt文件的全路径：");
		if(scanner.hasNext()){
			filePath = scanner.next();
		}
		scanner.close();

		File file = new File( filePath );
		if(file.exists()){
			try (BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream( file ),"GBK" ) )){

				char[] chars = new char[1024];
				int len;
				StringBuffer sb = new StringBuffer();//默认大小8096

				while((len = br.read( chars )) != -1){
					sb.append( chars,0,len );
				}
				System.out.println(sb.toString());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println();
		}else{
			System.out.println("您输入的文件不存在。");
		}

	}
}
