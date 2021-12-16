public class AppFigure {


    public static void main(String[] args) {

        Square square1 = new Square(4);
        Rectangle rectangle1 = new Rectangle(7, 6);
        Triangle triangle1 = new Triangle(2, 5,4);

        System.out.println("Периметр квадрата равен " + square1.getPerimeter());
        System.out.println("Периметр прямоугольника равен " + rectangle1.getPerimeter());
        System.out.println("Периметр треугольника равен " + triangle1.getPerimeter());


    }
}
