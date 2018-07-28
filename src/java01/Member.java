package java01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Member {

	public void output1(){
		System.out.println("Tom and Merry");
	}

	public void output2() throws IOException {
		System.out.println("请输入Tom");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		System.out.println("请输入Merry");
		br = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br.readLine();

		System.out.println(str1+" and "+str2);
	}

	public static void main(String[] args) throws IOException {
		Member member = new Member();
		//member.output1();
		member.output2();
	}
}
