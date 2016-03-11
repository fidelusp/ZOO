import java.math.BigDecimal;

/**
 * Created by Paweł on 2016-03-11.
 */
public class Dog extends Animal {

    public Dog(BigDecimal length, BigDecimal height, BigDecimal width, Colour colour) {
        super(length, height, width, colour);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
