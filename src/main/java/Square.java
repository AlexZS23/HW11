public class Square implements Figure {

    private double a = 5;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
