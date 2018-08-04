package newjava2.ex02.ex5;

import java.util.Date;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/4 15:43
 * @Description:
 * 5.    创建订单类，创建实例属性、商品、商品名、订单id、创建时间、订单状态。
 * 创建商品类，创建实例属性、名称、类别、上架时间、库存、价格并分别创建相对应得getter、setter方法，
 * 使用setter方法为属性赋值，并通过getter方法获取对象属性并打印。分别创建名称构造，名称，类别构造器，
 * 名称、类别、库存构造器，名称、类别、库存、价格构造器，名称、类别、库存、价格、上架时间构造器。
 * 修改此类，将上架改为类属性，并修改源代码。
 */
public class Goods {

	private String name;
	private String type;
	private Integer inventory;
	private Double price;

	private static Date addTime;

	public Goods(String name) {
		this.name = name;
	}

	public Goods(String name, String type) {
		this(name);
		this.type = type;
	}

	public Goods(String name, String type, Integer inventory) {
		this(name, type);
		this.inventory = inventory;
	}

	public Goods(String name, String type, Integer inventory, Double price) {
		this(name, type, inventory);
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static Date getAddTime() {
		return addTime;
	}

	public static void setAddTime(Date addTime) {
		Goods.addTime = addTime;
	}
}
