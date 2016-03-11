import java.math.BigDecimal;

/**
 * Created by Łukasz on 2016-03-11.
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.hight= new BigDecimal(10);

        Cat cat = new Cat();
        cat.length = new BigDecimal(5);

        System.out.println(dog.hight);
        System.out.print(cat.length);

    }
}