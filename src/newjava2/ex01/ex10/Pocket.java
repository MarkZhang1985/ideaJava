package newjava2.ex01.ex10;

import java.util.Arrays;

/**
 * 10.	创建妖精类，有名称、类型、级别、血量等类型，并创建口袋类，让口袋类拥有装妖精的能力，
 * 当执行收妖精的静态方法时，就可以把妖精装入口袋。如果口袋不够大，可以自动变大，当变大的操作发生后，
 * 提示口袋升级，以及输出当前口袋能装妖精的总个数，以及目前装了多少只妖怪。创造显示妖精的方法，
 * 通过给定下标来查看当前妖怪的信息。
 */
public class Pocket {

	private int length = 1;//口袋初始大小为1
	private int spiritNumer = 0; // 口袋初始妖精个数为0
	private Spirit[] spirits = new Spirit[length];

	public Pocket(){}

	public Pocket(int length, int spiritNumer, Spirit[] spirits) {
		this.length = length;
		this.spiritNumer = spiritNumer;
		this.spirits = spirits;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSpiritNumer() {
		return spiritNumer;
	}

	public void setSpiritNumer(int spiritNumer) {
		this.spiritNumer = spiritNumer;
	}

	public Spirit[] getSpirits() {
		return spirits;
	}

	public void setSpirits(Spirit[] spirits) {
		this.spirits = spirits;
	}

	@Override
	public String toString() {
		return "Pocket{" +
				"length=" + length +
				", spiritNumer=" + spiritNumer +
				", spirits=" + Arrays.toString( spirits ) +
				'}';
	}
}
