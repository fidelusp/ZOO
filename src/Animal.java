import java.math.BigDecimal;

public abstract class Animal implements Behaviour {

    private BigDecimal length;
    private BigDecimal height;
    private BigDecimal width;
    private Colour colour;

    public Animal(BigDecimal length, BigDecimal height, BigDecimal width, Colour colour) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.colour = colour;
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

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return getClass() + " Długośc: " + getLength() + " " + " Wysokość: " + getHeight() + " Szerokość: " + getWidth() + " Kolor: " + getColour();
    }
}
