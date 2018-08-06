package newjava7.ex1.ex3;

import java.text.ParseException;
import java.util.Calendar;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/6 17:32
 * @Description:
 * 根据省份证好计算年龄
 *
 */
public class AgeCalculator {
	public static void main(String[] args) throws ParseException {
		String str = "232301198012203421";
		System.out.println(new AgeCalculator().getAgeByIDCard(str));

	}

	public int getAgeByIDCard(String idCard) throws ParseException {
		int idYear = Integer.parseInt( idCard.substring( 6,10 ) );
		int idMonth = Integer.parseInt( idCard.substring( 10, 12 ) );
		int idDay = Integer.parseInt( idCard.substring( 12, 14 ) );
		Calendar calendar = Calendar.getInstance();
		int nowYear = calendar.get(Calendar.YEAR);
		int nowMonth = calendar.get( Calendar.MONTH) + 1;//计算月份从0开始
		int nowDay = calendar.get( Calendar.DAY_OF_MONTH );
		//System.out.println(""+nowYear+nowMonth+nowDay );
		int age = nowYear - idYear;
		if(nowYear == idYear) {//年份相同
			if (nowMonth == idMonth) {//月份相同
				if (nowDay >= idDay) return 0;
				else return -1;
			} else if (nowMonth > idMonth) return 0;
			else return -1;
		} else if(nowYear < idYear) return -1;
		return age;
	}
}
