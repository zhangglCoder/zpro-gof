package strategy;

public class Order {
    private Strategy strategy;

    public Order(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getScal(){
        return strategy.scal();
    }
}
