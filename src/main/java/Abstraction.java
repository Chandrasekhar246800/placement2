public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.area();
        
        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.area();
    }
}
abstract class Shape {
    abstract void draw();
    abstract void area();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }   
    void area() {
        System.out.println("Circle Area = πr²");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }   
    void area() {
        System.out.println("Rectangle Area = length * width");
    }
}