package newjava6.ex2.ex1;

import java.io.*;
import java.util.Scanner;

/**
 * 习题一:用Scanner类在键盘输入一个文件全路径（txt），如果该文件存在,则把文件内容读到控制台里，
 * 如文件不存在，提则用户“您输入的文件不存在”
 */
public class simpleFileReader {

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
			try {
				//只有用下面的方式，才不会出现乱码，用FileReader都是乱码
				FileInputStream fis = new FileInputStream( file );
				InputStreamReader isr = new InputStreamReader( fis,"GBK" );
				BufferedReader br = new BufferedReader( isr );

				char[] chars = new char[1024];
				int len = -1;
				StringBuffer sb = new StringBuffer( 1000 );

				while((len = br.read( chars )) != -1){
					sb.append( chars );
				}
				System.out.println(sb.toString());

				if(br!=null) br.close();
				if(isr!=null) isr.close();


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
