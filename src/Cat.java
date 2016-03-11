import java.math.BigDecimal;

/**
 * Created by Łukasz on 2016-03-11.
 */
public class Cat extends Animal {

    public Cat(BigDecimal length, BigDecimal height, BigDecimal width, Colour colour) {
        super(length, height, width, colour);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
