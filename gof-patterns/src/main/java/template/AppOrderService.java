package template;

/**
 * 微信类的订单
 */
public class AppOrderService extends AbstractOrderService {

    @Override
    public void getGoods() {
        System.out.println("创建订单的时候，先要查询商品库存信息");
    }

    @Override
    public void init() {
        System.out.println("订单初始化工作-App服务");
    }
}
