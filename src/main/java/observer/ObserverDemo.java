package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("If state = 15");
        subject.setState(15);

        System.out.println("---------------");

        System.out.println("If state = 10");
        subject.setState(10);
    }
}
