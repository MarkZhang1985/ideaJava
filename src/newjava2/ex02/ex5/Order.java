package newjava2.ex02.ex5;

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
	private String createTime;
	private String status;

}
