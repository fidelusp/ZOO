import java.math.BigDecimal;

public class Owl extends Animal {

    public Owl(BigDecimal length, BigDecimal height, BigDecimal width) {
        super(length, height, width);
    }

    @Override
    public String makeSound() {
        return "Hoo hoo";
    }
}
