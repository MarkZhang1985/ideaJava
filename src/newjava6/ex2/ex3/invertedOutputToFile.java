package newjava6.ex2.ex3;

import java.io.*;
import java.util.Scanner;

/**
 * 习题三：键盘输入一个自己指定的文件名，按行读取文件内容，然后，再按行反向输出到指定的另一个文件中
 */
public class invertedOutputToFile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in );
		String inFilePath = null;
		String outFilePath = null;
		File inFile = null;
		File outFile = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw= null;
		char[] chars = new char[1024];
		StringBuffer sb = new StringBuffer( 10000 );


		System.out.println("请输入一个想要读取文件的路径：");
		if(scanner.hasNext()){
			inFilePath = scanner.next();
		}

		inFile = new File( inFilePath );
		if(!inFile.exists()){
			System.out.println("要读取的文件不存在。");
			return;
		}else{
			System.out.println("尝试打开：" + inFile.toString());
			System.out.println("文件大小：" + inFile.length() + 'b');
		}

		System.out.println("请输入反向复制文件的名称：");
		if(scanner.hasNext()){
			outFilePath = "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex3\\" + scanner.next() + ".txt";
		}
		outFile = new File( outFilePath );
		try {
			outFile.createNewFile();
			System.out.println("复制文件建立成功。");
		} catch (IOException e) {
			System.out.println("复制文件创建失败。");
		}

		try {
			System.out.println("尝试反向复制文件。。");
			fis = new FileInputStream( inFile );
			fos = new FileOutputStream( outFile );
			isr = new InputStreamReader( fis,"GBK" );
			osw = new OutputStreamWriter( fos,"GBK" );
			BufferedReader br = new BufferedReader( isr );
			BufferedWriter bw = new BufferedWriter( osw );

			int len = -1;
			while((len = br.read(chars)) != -1) {
				sb.append( chars );
			}
			sb = sb.reverse();

			bw.write( sb.toString() );


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}
}
