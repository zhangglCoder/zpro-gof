package strategy;

public class RunMain {

    public static void main(String[] args) {

        System.out.println( new Order(new PesionStrategy()).getScal());
        System.out.println( new Order(new VipStrategy()).getScal());
    }
}
