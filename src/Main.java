import java.math.BigDecimal;

/**
 * Created by Łukasz on 2016-03-11.
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.hight= new BigDecimal(10);

        System.out.print(dog.hight);

    }
}