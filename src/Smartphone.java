public class Smartphone extends Device {

    private int height;
    private int width;
    private double diagonal;

    public Smartphone(String type, double price, double weight, int height, int width, double diagonal) {
        super(type, price, weight);
        this.height = height;
        this.width = width;
        this.diagonal = diagonal;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "\nSmartphone {" +
                "price=" + this.getPrice() + '$' +
                ", weight=" + this.getWeight() + " kg" +
                ", height=" + height + " cm" +
                ", width=" + width + " cm" +
                ", diagonal=" + diagonal + " cm" +
                '}';
    }
}
