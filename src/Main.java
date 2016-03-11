import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.height = new BigDecimal(10);

        Cat cat = new Cat();
        cat.length = new BigDecimal(5);

        Owl owl = new Owl();
        owl.width = new BigDecimal(500);

        System.out.println(dog.height);
        System.out.println(cat.length);
        System.out.print("Sowa " +owl.width);

    }
}