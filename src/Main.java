import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog(new BigDecimal(99), new BigDecimal(21), new BigDecimal(34), Colour.BLACK);
        System.out.println(dog.getLength());
        dog.setLength(new BigDecimal(100));
        System.out.println(dog.getLength());

        Animal cat = new Cat(new BigDecimal(99), new BigDecimal(21), new BigDecimal(34), Colour.BLACK);

        Animal owl = new Owl(new BigDecimal(99), new BigDecimal(21), new BigDecimal(34), Colour.BLACK);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(owl);
        System.err.println(animals.size());

        System.out.println("Pies: " + animals.get(0).makeSound() + " " + animals.get(0).getColour());
        waitSec(1);
        System.out.println("Kot: " + animals.get(1).makeSound() + " " + animals.get(1).getColour());
        waitSec(2);
        System.out.println("Sowa: " + animals.get(2).makeSound() + " " + animals.get(2).getColour());
        waitSec(3);

        System.out.printf(animals.get(0).toString());

    }

    /**
     * Sleeps program for a number of seconds
     * @param sec
     * number of seconds
     */

    private static void waitSec(int sec){
        try {
            Thread.sleep(1000*sec);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}