import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {


//		String s0 ="hello";
//		String s1 = "hello";
//		String s2 = "he" + "llo";
//		System.out.println(s0 ==s1);
//		System.out.println(s0 ==s2);
//
//		int a = (int)9.9;
//		System.out.println("output:");
//		System.out.println('\u0000');
//		System.out.println('\u1122');

//				Circle x = new Circle();
//				System.out.println(x.PI);
//				System.out.println(Circle.PI);
//				Circle.PI = 3.14;
//				System.out.println(x.PI);
//				System.out.println(Circle.PI);

//		int arr[]= new int[10];
//		System.out.println(arr.length);
//		System.out.println(arr[0]);
	@Test
	public void test01(){
		File file = new File( "hello.txt" );
		if(file.exists()){
			System.out.println("文件已存在");
		}else{
			try {
				file.createNewFile();
				System.out.println("文件创建成功。");
			} catch (IOException e) {
				System.out.println("文件创建失败。");
			}
		}
		System.out.println("文件相对路径：" + file.getPath());
		System.out.println("文件绝对路径：" + file.getAbsolutePath());
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd,HH:mm:ss" );
		System.out.println("文件创建时间：" + sdf.format( new Date( file.lastModified() ) ));
		System.out.println("文件创建大小：" + file.length() + 'b');


	}

	@Test
	public void test02(){
		File file = new File( "src/1.png" );
		File newFile = new File("new.png");
		OutputStream os = null;
		InputStream is = null;

		if(file.exists()) {
			try {
				os = new FileOutputStream( newFile );
				is = new FileInputStream( file );
				byte[] bytes = new byte[1024];
				int len = -1;
				while ((len = is.read(bytes)) != -1){//若未读到文件末尾，则继续读，-1时读完
					System.out.println("length：" + len);
					os.write( bytes, 0, len );
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{//关闭资源
				if(is!=null){
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(os!=null){
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		}else{
			System.out.println("文件不存在。");
		}
	}


	/**
	 * Reader
	 */
	@Test
	public void test03(){
		File file = new File( "new.png" );
		Reader reader = null;

		try {
			reader = new FileReader( file );
			char[] chars = new char[512];

			int len = -1;
			while ((len = reader.read(chars)) != -1){
				System.out.println(new String(chars,0, len));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


	/**
	 * FileInputStream 和 InputStreamReader
	 * 缓冲流加快速度
	 */
	@Test
	public void test04(){
		File file = new File( "new.txt" );
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileInputStream = new FileInputStream( file );
			inputStreamReader = new InputStreamReader( fileInputStream, "GBK" );
			bufferedReader = new BufferedReader( inputStreamReader );
			char[] chars = new char[512];//空间越大，速度越快

			int len = -1;
			StringBuffer stringBuffer = new StringBuffer( 1000 );//空间越大，速度越快
			while ((len = bufferedReader.read(chars)) != -1){
				stringBuffer.append( chars );
			}
			System.out.println(stringBuffer);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(inputStreamReader!=null) {
				try {
					inputStreamReader.close();//会自动检测节点流是否关闭。
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bufferedReader!=null){
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test05(){
		StringBuffer sb = new StringBuffer( 1000 );
		char a = 'A';
		char b=  'B';
		char c=  'C';
		char d = 'D';

		char[] chars = new char[]{'1', '2', '3'};

		System.out.println(sb.toString());
		sb.append( a );
		sb.append( b );
		System.out.println(sb.toString());
		sb.append( chars );
		System.out.println(sb.toString());
		sb.insert( 0,c );
		sb.insert( 0,d );
		System.out.println(sb.toString());


	}

}
