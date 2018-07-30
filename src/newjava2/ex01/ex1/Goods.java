package newjava2.ex01.ex1;

import java.util.Calendar;

/**
 * 1.  创建Goods类，声明实例变量id，name，createTime，price
 * 注意:createtime 为日期型，通过查找资料，选择合适的类型定义。
 * 创建两个Goods对象，一个IphoneX,一个三星，并为两个对象的实例变量赋值。
 * 最后使用System.out对象打印输出IphoneX和三星的实例变量。
 */
public class Goods {

	public String id;
	public String name;
	public Calendar createTime;
	public double price;

	@Override
	public String toString() {
		return "id: " + this.id
				+ "\nname: " + this.name
				+ "\ncreate time: " + this.createTime.get( Calendar.YEAR ) + "年" + this.createTime.get(Calendar.MONTH)+ "月" + this.createTime.get(Calendar.DAY_OF_MONTH) + "日"
				+ "\nprice: " + this.price;
	}
}
