package GroupProjectSep11.Task1;

public class ShapeTester {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);

        Shape square = new Square();
        square.calculateArea(5);
        square.calculatePerimeter(5);
    }
}
