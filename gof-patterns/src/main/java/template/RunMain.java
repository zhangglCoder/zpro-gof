package template;

public class RunMain {

    public static void main(String[] args) {
        AbstractOrderService orderService = new WxOrderService();
        orderService.create();
        System.out.println("***************************************");
        AbstractOrderService appOrderService = new AppOrderService();
        appOrderService.create();

    }
}
