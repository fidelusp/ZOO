import java.math.BigDecimal;

public abstract class Animal implements Behaviour {

    private BigDecimal length;
    private BigDecimal height;
    private BigDecimal width;

    public Animal(BigDecimal length, BigDecimal height, BigDecimal width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }
}
