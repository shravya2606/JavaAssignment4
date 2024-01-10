package JavaAssignment4;

abstract class Shape {
 public abstract double calculateArea();
 public void displayInfo() {
     System.out.println("This is a shape.");
 }
}

class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementation of the abstract method for calculating the area of a circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Additional method specific to the Circle class
 public void displayRadius() {
     System.out.println("Radius: " + radius);
 }
}
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementation of the abstract method for calculating the area of a rectangle
 @Override
 public double calculateArea() {
     return length * width;
 }

 // Additional method specific to the Rectangle class
 public void displayDimensions() {
     System.out.println("Length: " + length);
     System.out.println("Width: " + width);
 }
}

//Main class to demonstrate abstraction
public class AbstractionExp{
 public static void main(String[] args) {
  
     Circle circle = new Circle(5.0);
     Rectangle rectangle = new Rectangle(4.0, 6.0);
     Shape shape1 = circle;
     Shape shape2 = rectangle;

     shape1.displayInfo();
     System.out.println("Area of Circle: " + shape1.calculateArea());
     ((Circle) shape1).displayRadius();  // Casting to access subclass-specific method

     System.out.println();

     shape2.displayInfo();
     System.out.println("Area of Rectangle: " + shape2.calculateArea());
     ((Rectangle) shape2).displayDimensions();
 }
}
