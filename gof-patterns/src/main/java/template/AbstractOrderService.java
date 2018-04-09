package template;

/**
 * 抽象的订单服务模板类
 */
public abstract class AbstractOrderService {

    public abstract void getGoods();

    public abstract void init();

    /**
     * 创建订单的模板方法
     */
    final void create(){
        getGoods();
        init();

    }
}
