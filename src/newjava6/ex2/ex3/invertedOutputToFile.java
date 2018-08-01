package newjava6.ex2.ex3;

import java.io.*;
import java.util.Scanner;

/**
 * 习题三：键盘输入一个自己指定的文件名，按行读取文件内容，然后，再按行反向输出到指定的另一个文件中
 */
public class invertedOutputToFile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in );
		String inPath = null;
		String outPath = null;
		File in, out;

		System.out.println("请输入一个想要读取文件的路径：");
		if(scanner.hasNext()){
			inPath = scanner.next();
		}

		in = new File( inPath );
		if(!in.exists()){
			System.out.println("要读取的文件不存在。");
			return;
		}else{
			System.out.println("尝试打开：" + in.toString());
			System.out.println("文件大小：" + in.length() + 'b');
		}

		System.out.println("请输入反向复制文件的名称：");
		if(scanner.hasNext()){
			outPath = "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex3\\" + scanner.next() + ".txt";
		}
		out = new File( outPath );
		try {
			out.createNewFile();
			System.out.println("复制文件建立成功。");
		} catch (IOException e) {
			System.out.println("复制文件创建失败。");
		}

		try(BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream( in ),"GBK" ) );
			BufferedWriter bw = new BufferedWriter( new FileWriter( out ) )) {//写入时按照utf-8编码写入

			System.out.println("尝试反向复制文件。。");

			char[] chars = new char[1024];
			StringBuffer sb = new StringBuffer();
			int len;
			while((len = br.read(chars)) != -1) {
				sb.append( chars,0,len );
			}
			sb = sb.reverse();//反转

			bw.write( sb.toString() );

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
