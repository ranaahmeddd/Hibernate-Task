package adapter;

public class AdapterDemo {
    public static void main(String args[]) {
        Bird sparrow = new Sparrow();
        ToDuck plasticToyDuck = new PlasticToyDuck();

        System.out.println("Sparrow...");
        sparrow.makeSound();
        sparrow.fly();

        System.out.println("ToyDuck...");
        plasticToyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        ToDuck birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();

    }
}
