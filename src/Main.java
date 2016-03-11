import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.height = new BigDecimal(10);

        Animal cat = new Cat();
        cat.length = new BigDecimal(5);

        Animal owl = new Owl();
        owl.width = new BigDecimal(500);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(owl);
        System.err.println(animals.size());

        System.out.println("Tutaj? " + animals.get(0).height);
        System.out.println(cat.length);
        System.out.print("Sowa " +owl.width);

    }
}