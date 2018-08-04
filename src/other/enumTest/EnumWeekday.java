package other.enumTest;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/3 11:15
 * @Description:
 */
public enum EnumWeekday {
	SUN(0),MON(1),TUS(2),WED(3),THU(4),FRI(5),SAT(6);//名字相当于new了一个EnumWeekday的实例，static final，括号里面是参数，需要在构造方法中初始化。

	private int value;

	private EnumWeekday(int value) {
		this.value = value;
	}

	public static EnumWeekday getNextDay(EnumWeekday nowDay){
		int nextDayValue = nowDay.value;

		if (++nextDayValue == 7){
			nextDayValue =0;
		}

		return getWeekdayByValue(nextDayValue);
	}

	public static EnumWeekday getWeekdayByValue(int value) {
		for (EnumWeekday c : EnumWeekday.values()) {
			if (c.value == value) {
				return c;
			}
		}
		return null;
	}

}

class Test2 {
	public static void main(String[] args) {
		System.out.println( "nowday ====> " + EnumWeekday.SAT );
		//可以代替 getWeekdayByValue？？
		System.out.println( "nowday int ====> " + EnumWeekday.SAT.ordinal() );//@return the ordinal of this enumeration constant
		System.out.println( "nextday ====> " + EnumWeekday.getNextDay( EnumWeekday.SAT ) ); // 输出 SUN

		//输出：
		//nowday ====> SAT
		//nowday int ====> 6
		//nextday ====> SUN

		System.out.println(EnumWeekday.valueOf("sun".toUpperCase()));
		//MON
		EnumWeekday.valueOf( "MON" );

		for (EnumWeekday w : EnumWeekday.values()){
			System.out.println(w + ".ordinal()  ====>" +w.ordinal());
		}
		//SUN.ordinal()  ====>0
		//MON.ordinal()  ====>1
		//TUS.ordinal()  ====>2
		//WED.ordinal()  ====>3
		//THU.ordinal()  ====>4
		//FRI.ordinal()  ====>5
		//SAT.ordinal()  ====>6

		System.out.println("Weekday.MON.compareTo(Weekday.FRI) ===> " + EnumWeekday.MON.compareTo(EnumWeekday.FRI));
		System.out.println("Weekday.MON.compareTo(Weekday.MON) ===> " + EnumWeekday.MON.compareTo(EnumWeekday.MON));
		System.out.println("Weekday.MON.compareTo(Weekday.SUM) ===> " + EnumWeekday.MON.compareTo(EnumWeekday.SUN));
		//Weekday.MON.compareTo(Weekday.FRI) ===> -4
		//Weekday.MON.compareTo(Weekday.MON) ===> 0
		//Weekday.MON.compareTo(Weekday.SUM) ===> 1

		System.out.println("Weekday.MON.name() ====> " + EnumWeekday.MON.name());
		//Weekday.MON.name() ====> MON

	}
}

