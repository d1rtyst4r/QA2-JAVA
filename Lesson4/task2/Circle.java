package lv.javaguru.JavaGuruQA2.Lesson4.ClassWork.task2;

public class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public int numberOfSides() {
        return super.numberOfSides();
    }
}
