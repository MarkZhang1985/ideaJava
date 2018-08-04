package newjava6.ex2.ex7;

import newjava6.ex2.ex6.MyInput;

import java.io.File;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/3 15:08
 * @Description:
 * 习题 七 File练习题：
 * 查找指定目录中，扩展名为.txt的文件
 * 将目录和目录下的文件以下面的形式打印在控制台上
 * 文件夹 aaa
 * 			|-----文件夹ccc
 * 					|-----文件c.jsp
 * 			|-----文件tt.txt
 * 			|-----文件abc.jpg
 * 文件夹bbb
 * 			|-----文件a.txt
 * 文件hello.ppt
 */
public class ShowFilePath {

	public static final String SPACE = "\t\t";

	public static void filePath(File file, String space){
		String str = "";
		if(space!="")str = "|------";
		if(file.isFile()){
			System.out.println(space + str + "文件" + file.getName());
			return;
		}
		if(file.isDirectory()){
			System.out.println(space + str + "文件夹" + file.getName());
			String sp = space + SPACE;
			File[] files = file.listFiles();
			for(File f : files){
				filePath( f, sp );
			}
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
		filePath( file.getParentFile(), "" );

	}
}
