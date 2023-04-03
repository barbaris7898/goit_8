
public class ShapeTest{
    public static void main(String[] args){
        PrintShapeName printShapeName = new PrintShapeName();
        Shape shape = new Shape();
        printShapeName.printShape(shape);
        Circle circle = new Circle();
        printShapeName.printShape(circle);
        Quad quad = new Quad();
        printShapeName.printShape(quad);
        Rectangle rectangle = new Rectangle();
        printShapeName.printShape(rectangle);
        Hexagon hexagon = new Hexagon();
        printShapeName.printShape(hexagon);
        Triangle triangle = new Triangle();
        printShapeName.printShape(triangle);
    }
}
