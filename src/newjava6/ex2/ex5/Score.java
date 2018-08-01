package newjava6.ex2.ex5;

import java.io.*;

/**
 * 习题 五：已知D盘下有如果文件score.txt文件，文件里的数据格式如下（（姓名-年龄-总分)
 * lucy-28-98 lily-23-97 robt-25-100 wili-15-100 klin-29-93），把文件的每一条数据进行判断
 * 如果总分大于90分，则存入D盘下score_highscore.txt文件中，
 * 介于75分和90分之间的则存入D盘下score_middlescore.txt文件中，
 * 低于75分的，则存入D盘下score_lowscore.txt文件中。
 */
public class Score {


	public static void main(String[] args) {
		String inPath = "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex5\\score.txt";
		String outPathHigh = "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex5\\score_highscore.txt";
		String outPathMiddle = "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex5\\score_middlescore.txt";
		String outPathLow = "C:\\Users\\zhangkaiming\\ideaJava\\src\\newjava6\\ex2\\ex5\\score_lowscore.txt";

		File in = new File(inPath);
		if(in.exists() && in.length()!=0){
			System.out.println("正在打开文件。。。");

			StringBuffer sbHigh = new StringBuffer(  );
			StringBuffer sbMiddle = new StringBuffer(  );
			StringBuffer sbLow = new StringBuffer(  );

			try(BufferedReader br = new BufferedReader( new FileReader( in ) )){

				//读取学生数据
				char[] chars = new char[1024];
				StringBuffer sb = new StringBuffer(  );
				int len;
				while((len = br.read(chars))!=-1){
					sb.append( chars,0,len );
				}
				String[] studentMessage = sb.toString().split( " " );

				//将学生数据按照成绩存入缓冲区
				double score;
				for(String str : studentMessage){
					score = Double.parseDouble( str.split( "-" )[2] );//获取学生成绩，转为数字
					//System.out.println("score："+score);
					if(score >= 90){
						sbHigh.append( str );
						sbHigh.append( " " );
					}
					else if(score >= 75 && score < 90){
						sbMiddle.append( str );
						sbMiddle.append( " " );
					}
					else if(score > 0 && score < 75){
						sbLow.append( str );
						sbLow.append( " " );
					}
					else System.out.println("不符合条件的数据：" + str);
				}

				//写入文件
				File out = new File( outPathHigh );
				out.createNewFile();
				BufferedWriter bw = new BufferedWriter( new FileWriter( out ) );
				bw.write( sbHigh.toString() );
				bw.flush();



				out = new File( outPathMiddle );
				out.createNewFile();
				bw = new BufferedWriter( new FileWriter( out ) );
				bw.write( sbMiddle.toString() );
				bw.flush();


				out = new File( outPathLow );
				out.createNewFile();
				bw = new BufferedWriter( new FileWriter( out ) );
				bw.write( sbLow.toString() );
				bw.flush();

				bw.close();



			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}else{
			System.out.println("文件不存在或文件没有内容。");
		}

	}

}
