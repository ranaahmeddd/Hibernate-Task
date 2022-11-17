package command;

public class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Order buyOrder = new BuyOrder(stock);
        Order sellOrder = new SellOrder(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }
}
