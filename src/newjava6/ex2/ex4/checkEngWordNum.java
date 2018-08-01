package newjava6.ex2.ex4;

import java.io.*;
import java.util.Scanner;

/**
 * 习题四：输盘输入一个自己指定的文件名，统计该文件中，每个字符出现的个数（纯英文文件）
 */
public class checkEngWordNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		String inpath = null;
		System.out.println("本程序查找文件英文字符的个数，请输入一个txt文件的全路径：");
		if(scanner.hasNextLine()){
			inpath = scanner.nextLine();
		}
		scanner.close();

		File in = new File( inpath );

		if(!in.exists() && in.length()!=0){
			System.out.println("文件不存在或文件没有内容。");
		}else{
			try(BufferedReader br = new BufferedReader( new FileReader( in ) )) {
				char[] chars = new char[1024];
				StringBuffer sb = new StringBuffer();
				int len;
				while((len = br.read(chars)) != -1){
					sb.append( chars,0,len );
				}

				char[] letters = sb.toString().trim().toLowerCase().toCharArray();
				int count;
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
			}
		}
	}
}
