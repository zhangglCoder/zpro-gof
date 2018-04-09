package adapter;

public class RunMain {

    /**
     * 适配器模式的重点是，可以适配原来的接口，做一些操作，让Client端感知不到区别
     */
    public static void main(String[] args) {
        UserServiceAdapter adapter = new UserServiceAdapter(new UserExtAdaptee());
        adapter.getUser();
    }
}
