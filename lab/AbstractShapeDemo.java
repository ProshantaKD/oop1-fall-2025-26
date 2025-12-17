abstract class Shape {
    abstract void calculateArea();

    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area:" + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area:" + area);
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        rectangle.displayShape();
        rectangle.calculateArea();

        circle.displayShape();
        circle.calculateArea();
    }

}
