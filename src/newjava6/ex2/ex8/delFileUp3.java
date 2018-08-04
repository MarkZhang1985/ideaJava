package newjava6.ex2.ex8;

import newjava6.ex2.ex6.MyInput;

import java.io.File;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/3 19:12
 * @Description:
 */
public class delFileUp3 {

	public static final int MAX_LEVEL = 3;//允许删除的最大层数

	public static void delFile3(File file, int level){
		File parentFile = file.getParentFile();
		if(level > MAX_LEVEL)return;
		if(level <= MAX_LEVEL && level> 0){//若小于最大层数，删除本层文件，并进入上一层文件夹
			File[] files = parentFile.listFiles();
			for(File f : files){
				System.out.println("正在删除第"+level+"层文件："+f.getName());
				f.delete();
			}
			delFile3( parentFile,level+1 );
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
		delFile3( file,1 );
	}
}
