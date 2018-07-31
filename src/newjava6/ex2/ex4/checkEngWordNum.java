package newjava6.ex2.ex4;

import java.io.*;
import java.util.Scanner;

/**
 * 习题四：输盘输入一个自己指定的文件名，统计该文件中，每个字符出现的个数（纯英文文件）
 */
public class checkEngWordNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		String filePath = null;
		System.out.println("本程序查找文件英文字符的个数，请输入一个txt文件的全路径：");
		if(scanner.hasNextLine()){
			filePath = scanner.nextLine();
		}
		scanner.close();

		File file = new File( filePath );
		FileReader fr = null;
		BufferedReader br = null;
		char[] chars = new char[1024];
		StringBuffer sb = new StringBuffer( 100000 );
		if(!file.exists() && file.length()!=0){
			System.out.println("文件不存在或文件没有内容。");
		}else{
			try {
				fr = new FileReader( file );
				br = new BufferedReader( fr );
				int len = -1;
				while((len = br.read(chars)) != -1){
					sb.append( chars );
				}

				char[] letters = sb.toString().trim().toLowerCase().toCharArray();
				int count = 0;
				for(char ch = 'a'; ch<='z'; ch++){
					count = 0;
					for(char le : letters){
						if(le == ch)count++;
					}
					System.out.println("字母" + ch + "出现了" + count + "次。");
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(br != null){
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
