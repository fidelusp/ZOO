import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog(new BigDecimal(99), new BigDecimal(21), new BigDecimal(34));
        System.out.println(dog.getLength());
        dog.setLength(new BigDecimal(100));
        System.out.println(dog.getLength());

        Animal cat = new Cat(new BigDecimal(99), new BigDecimal(21), new BigDecimal(34));

        Animal owl = new Owl(new BigDecimal(99), new BigDecimal(21), new BigDecimal(34));

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(owl);
        System.err.println(animals.size());

        System.out.println("Pies: " + animals.get(0).makeSound());
        System.out.println("Kot: " + animals.get(1).makeSound());
        System.out.println("Sowa: " + animals.get(2).makeSound());

    }
}