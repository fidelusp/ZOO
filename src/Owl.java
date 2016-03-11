import java.math.BigDecimal;

public class Owl extends Animal {

    public Owl(BigDecimal length, BigDecimal height, BigDecimal width, Colour colour) {
        super(length, height, width, colour);
    }

    @Override
    public String makeSound() {
        return "Hoo hoo";
    }
}
