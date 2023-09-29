public class Tablet extends Device {

    private int height;
    private int width;
    private double diagonal;

    public Tablet(String type, double price, double weight, int height, int width, double diagonal) {
        super(type, price, weight);
        this.height = height;
        this.width = width;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "\nTablet {" +
                "price=" + this.getPrice() + '$' +
                ", weight=" + this.getWeight() + " kg" +
                ", height=" + height + " cm" +
                ", width=" + width + " cm" +
                ", diagonal=" + diagonal + " cm" +
                '}';
    }
}
