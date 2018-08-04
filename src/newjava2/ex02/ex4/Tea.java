package newjava2.ex02.ex4;

import org.junit.Test;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/4 15:20
 * @Description:
 * 4. 创建茶类，创建实例属性、茶名、产地、采摘年份、类型、并创建相对应得getter、setter方法。
 * 创建2种茶并通过setter方法为属性赋值，通过getter方法获取对象属性并打印，重写toString()方法。
 *
 *
这个模型包括汽车的如下属性：汽缸、排量、马力、重量、加速度、年份、产地及制造商。
The model includes these possible attributes of the car: cylinders, displacement,
horsepower, weight, acceleration, model year, origin, and car make.
 */
public class Tea {
	private String name;
	private String origin;
	private String pickedYear;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getPickedYear() {
		return pickedYear;
	}

	public void setPickedYear(String pickedYear) {
		this.pickedYear = pickedYear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tea{" +
				"name='" + name + '\'' +
				", origin='" + origin + '\'' +
				", pickedYear='" + pickedYear + '\'' +
				", type='" + type + '\'' +
				'}';
	}

	@Test
	public void test(){
		Tea puEr = new Tea();
		Tea wuLong = new Tea();

		puEr.setName( "普洱茶" );
		puEr.setOrigin( "云南" );
		puEr.setPickedYear( "2010" );
		puEr.setType( "熟茶" );

		wuLong.setName( "乌龙茶" );
		wuLong.setOrigin( "福建" );
		wuLong.setPickedYear( "2017" );
		wuLong.setType( "半发酵茶" );

		System.out.println(puEr.toString());
		System.out.println(wuLong.toString());
	}
//  运行结果：
//	Tea{name='普洱茶', origin='云南', pickedYear='2010', type='熟茶'}
//	Tea{name='乌龙茶', origin='福建', pickedYear='2017', type='半发酵茶'}
}


