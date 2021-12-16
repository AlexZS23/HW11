public class Rectangle implements Figure {

    private double firstSide = 3;
    private double secondSide = 5;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * firstSide + 2 * secondSide;
    }
}
