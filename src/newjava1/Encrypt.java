package newjava1;

/**
 * 5.	定义字符‘银’，‘行’，‘帐’，‘户’四个字符，通过^运算，将字符加密，
 */
public class Encrypt {

	public static void main(String[] args) {

		char ch1 = '银', ch2 = '行', ch3 = '账', ch4 = '户';
		int encryptCode = 5;
		System.out.println("原文：" + ch1 + ch2 + ch3 + ch4);
		ch1 += encryptCode;
		ch2 += encryptCode;
		ch3 += encryptCode;
		ch4 += encryptCode;
		System.out.println("简单加密：" + ch1 + ch2 + ch3 + ch4);

	}
}
