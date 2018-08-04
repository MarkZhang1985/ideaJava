package newjava6.ex2.ex9;

import newjava6.ex2.ex6.MyInput;

import java.io.*;
import java.math.BigInteger;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/3 19:26
 * @Description:
 * 习题九，切割文件
 * 	Window10.iso
 * 		500M  window10_1.iso
 * 			   Window10_2.iso
 */
public class DivideFile {

	public static void divideFile(File in, int intputSize) {//参数为欲分割的文件，要分割的大小(MB)

		//在源文件目录下建立输出文件夹
		File dirFile = new File(in.getParent() + File.separator + "divided");
		if(dirFile.mkdir()){
			System.out.println("输出文件夹已经创立完毕，在源文件当前目录下，名称为divide");
		}else {
			System.out.println("无法创立输出文件夹。");
			return;
		}
		//建立输出文件
		BigInteger size = new BigInteger( String.valueOf( intputSize ) );
		BigInteger totalSize = new BigInteger( String.valueOf( in.length() ) );//获取源文件的大小（字节）
		BigInteger outFileSize = size.multiply(new BigInteger( new Integer( 1024*1024 ).toString()) );//输出文件的大小
		System.out.println("源文件大小：" + totalSize.divide( new BigInteger( "1048576" ) ) + "MB");
		System.out.println("分割包大小：" + size + "MB");
		//获取分割文件的个数
		int outMax = 0;
		BigInteger[] re = totalSize.divideAndRemainder( outFileSize );
		if(re[1].equals( 0 ))outMax = re[0].intValue();
		else outMax = re[0].intValue()+1;
		System.out.println("共需要创建" + outMax + "个分割文件。");
		//建立输出文件数组
		File[] outs = new File[outMax];
		System.out.println("开始创建分割文件。。。");
		for(int i=0; i<outMax; i++){
			File out = new File( dirFile.getPath() + File.separator + in.getName() + "_" + (i) );
			try {
				out.createNewFile();
				outs[i] = out;
				System.out.println("创建分割文件成功：" + out.getPath());
			} catch (IOException e) {
				System.out.println("创建输出文件失败，文件序号：" + i);
			}
		}

		//分割文件
		try {
			System.out.println("准备写入分割文件。。。");
			BufferedInputStream bis = new BufferedInputStream( new FileInputStream( in ) );
			byte[] bytes = new byte[1024*1024];//每次读取1MB数据
			int len;
			int outNumCurrent = 0;//当前写入文件的序号
			BigInteger lenCurrent = new BigInteger( "0" );//当前文件写入的长度

			while ((len = bis.read( bytes )) != -1) {
				FileOutputStream fos;
				BufferedOutputStream bos;
				BigInteger bByte = new BigInteger( new Integer( bytes.length ).toString());//获取当前缓冲区的bigint类型，为了计算方便
				//判断缓存中数据长度大于分割块长度，则进入下一个分割文件。
				//System.out.println("lenCurrent:" + lenCurrent.intValue());
				lenCurrent = lenCurrent.add( bByte );//计算本次输出数据的总长度
				//System.out.println("lenCurrent:" + lenCurrent.intValue());
				if(lenCurrent.compareTo( outFileSize ) == 1){//大于
					int lenOld = outFileSize.subtract( lenCurrent.subtract( bByte ) ).intValue() ;//需要写入当前文件的长度
					int lenNew = lenCurrent.subtract( outFileSize ).intValue();//需要写入下一个文件的长度
					//写入现在文件
					fos = new FileOutputStream( outs[outNumCurrent],true );
					bos = new BufferedOutputStream( fos );
					bos.write( bytes,0, lenOld );
					bos.flush();
					//System.out.println("写入" + outNumCurrent + "号文件：" + lenOld + "b");
					//写入下一个文件
					System.out.println(outNumCurrent + "号分割文件已写满。写入下一个文件。。");
					outNumCurrent++;
					fos = new FileOutputStream( outs[outNumCurrent] );
					bos = new BufferedOutputStream( fos );
					bos.write( bytes, lenOld, lenNew );
					bos.flush();
					//System.out.println("写入" + outNumCurrent + "号文件：" + lenNew + "b");
					lenCurrent = new BigInteger( String.valueOf( lenNew ));//当前数据计数重置。
				}else{
					fos = new FileOutputStream( outs[outNumCurrent],true );
					bos = new BufferedOutputStream( fos );
					bos.write( bytes,0, len );
					bos.flush();
					//System.out.println("写入" + outNumCurrent + "号文件：" + bytes.length + "b");
					if(lenCurrent.compareTo( outFileSize ) == 0){
						System.out.println(outNumCurrent + "号分割文件已写满。");
						outNumCurrent++;//若文件写满，文件号加1
						lenCurrent = new BigInteger( "0" );//当前数据计数重置
						//System.out.println("lenCurrent:" + lenCurrent.intValue());
					}
				}
				bos.close();
				fos.close();
			}
			System.out.println("文件分割完毕。");
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



	public static void main(String[] args) {
		System.out.println("请输入txt文件路径：");
		String path = MyInput.readString();

		File file = new File( path );
		if(!file.exists()){
			System.out.println("文件不存在。");
			return;
		}

		long startTime = System.currentTimeMillis();
		divideFile( file, 500 );
		long endTime = System.currentTimeMillis();
		System.out.println("分割时间总计：" + (endTime-startTime) + "ms");

//		运行结果：
//		请输入txt文件路径：
//		C:\迅雷下载\cn_office_professional_plus_2016_x86_x64_dvd_6969182.iso
//		输出文件夹已经创立完毕，在源文件当前目录下，名称为divide
//		源文件大小：2468MB
//		分割包大小：500MB
//		共需要创建5个分割文件。
//		开始创建分割文件。。。
//		创建分割文件成功：C:\迅雷下载\divided\cn_office_professional_plus_2016_x86_x64_dvd_6969182.iso_0
//		创建分割文件成功：C:\迅雷下载\divided\cn_office_professional_plus_2016_x86_x64_dvd_6969182.iso_1
//		创建分割文件成功：C:\迅雷下载\divided\cn_office_professional_plus_2016_x86_x64_dvd_6969182.iso_2
//		创建分割文件成功：C:\迅雷下载\divided\cn_office_professional_plus_2016_x86_x64_dvd_6969182.iso_3
//		创建分割文件成功：C:\迅雷下载\divided\cn_office_professional_plus_2016_x86_x64_dvd_6969182.iso_4
//		准备写入分割文件。。。
//		0号分割文件已写满。
//		1号分割文件已写满。
//		2号分割文件已写满。
//		3号分割文件已写满。
//		文件分割完毕。
//		分割时间总计：39074ms

	}
}
