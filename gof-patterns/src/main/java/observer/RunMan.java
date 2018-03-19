package observer;

public class RunMan {
    public static void main(String[] args) {
        LogisticsManger manger = new LogisticsManger();
        SkuManger skuManger = new SkuManger();
        Order order = new Order();
        order.addObserver(manger);
        order.addObserver(skuManger);
        order.setState("test");
    }
}
