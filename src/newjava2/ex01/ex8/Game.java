package newjava2.ex01.ex8;

import java.util.Calendar;

/**
 * 8.	创建一个游戏类，实例变量游戏的类型，游戏的名称，游戏的发行时间，游戏的版本，游戏的最后更新时间，
 * 以及是否还在运营的属性。创建两个游戏并，并为游戏赋值，创造一个实例方法，打印游戏的全部属性，赋值后，
 * 通过调用实例方法答应游戏的全部信息
 */
public class Game {

	private String name;
	private Calendar releaseTime;
	private String version;
	private Calendar lastUpdateTime;
	private Boolean inOperation;

	public Game(String name, Calendar releaseTime, String version, Calendar lastUpdateTime, Boolean inOperation) {
		this.name = name;
		this.releaseTime = releaseTime;
		this.version = version;
		this.lastUpdateTime = lastUpdateTime;
		this.inOperation = inOperation;
	}

	@Override
	public String toString() {
		return "Game{" +
				"name='" + name + '\'' +
				", releaseTime=" + releaseTime.getTime() +
				", version='" + version + '\'' +
				", lastUpdateTime=" + lastUpdateTime.getTime() +
				", inOperation=" + inOperation +
				'}';
	}

	public static void main(String[] args) {

		Calendar releaseTime = Calendar.getInstance();
		releaseTime.set( 2000,1,1  );
		Calendar lastUpdateTime = Calendar.getInstance();
		lastUpdateTime.set( 2018,7,20  );
		Game game1 = new Game( "地下城与勇士", releaseTime,"10.1.1", lastUpdateTime, true);

		releaseTime.set( 1995,4,9  );
		lastUpdateTime.set( 2005,3,12  );
		Game game2 = new Game( "传奇", releaseTime,"6.1", lastUpdateTime, false );

		System.out.println(game1.toString());
		System.out.println();
		System.out.println(game2.toString());
	}
}
