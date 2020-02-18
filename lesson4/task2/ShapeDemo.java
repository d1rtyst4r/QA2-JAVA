package lv.javaguru.JavaGuruQA2.lesson4.classWork.task2;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("This is " +circle.getName() +".");
        System.out.println("Aria of this square is: " + circle.getArea() + ".");
        System.out.println("Circle has " + circle.numberOfSides() + " sides.");

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("This is " + triangle.getName() +".");
        System.out.println("Aria of this triange is: " + triangle.getArea() + ".");
        System.out.println("Triangle has " + triangle.numberOfSides() + " sides.");

        Square square = new Square(4);
        System.out.println("This is " + square.getName()+ ".");
        System.out.println("Aria of this square is: " + square.getArea()+ ".");
        System.out.println("Square has " + square.numberOfSides() + " sides.");

    }

}
