package newjava6.ex2.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/2 18:49
 * @Description:
 */

public class MyInput {

	private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

	// Read a string from the keyboard
	public static String readString (){
		try {
			return BUFFERED_READER.readLine();
		} catch (IOException e) {
			return "";
		}
	}

	// Read an int value from the keyboard
	public static int readInt () {
		//return Integer.parseInt( BUFFERED_READER.readLine().trim());
		try {
			return Integer.valueOf( BUFFERED_READER.readLine().trim() ).intValue();
		} catch (NumberFormatException e){
			return 0;
		}
		catch (IOException e) {
			return 0;
		}
	}

	// Read a double value from the keyboard
	//Double.parseDouble方法是把数字类型的字符串，转换成double类型
	//Double.valueOf方法是把数字类型的字符串，转换成Double类型，后边的doubelValue()是获取Double类型的double值
	public static double readDouble () {
		try {
			return Double.valueOf( BUFFERED_READER.readLine().trim() ).doubleValue();
		} catch (NumberFormatException e){
			return 0.0;
		}
		catch (IOException e) {
			return 0.0;
		}
	}

	// Read a byte value from the keyboard
	public static double readByte () {

		try {
			return Byte.valueOf( BUFFERED_READER.readLine().trim() ).byteValue();
		} catch (NumberFormatException e){
			return 0.0;
		}
		catch (IOException e) {
			return 0.0;
		}
	}

	// Read a short value from the keyboard
	public static double readShort () {
		try {
			return Short.valueOf( BUFFERED_READER.readLine().trim() ).shortValue();
		} catch (NumberFormatException e){
			return 0.0;
		}
		catch (IOException e) {
			return 0.0;
		}
	}

//	// Read a long value from the keyboard
//	public static double readLong () {
//	}
//
//	// Read a float value from the keyboard
//	public static double readFloat () {
//	}

}
