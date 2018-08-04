package newjava2.ex02.ex5;

import java.util.Date;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/4 15:42
 * @Description:
 * 5.    创建订单类，创建实例属性、商品、商品名、订单id、创建时间、订单状态。
 * 创建商品类，创建实例属性、名称、类别、上架时间、库存、价格并分别创建相对应得getter、setter方法，
 * 使用setter方法为属性赋值，并通过getter方法获取对象属性并打印。分别创建名称构造，名称，类别构造器，
 * 名称、类别、库存构造器，名称、类别、库存、价格构造器，名称、类别、库存、价格、上架时间构造器。
 * 修改此类，将上架改为类属性，并修改源代码。
 */
public class Order {

	private Goods goods;
	private String id;
	private Date createTime;
	private boolean status;//订单状态，true表示有效，false表示无效

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
