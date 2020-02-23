package lv.javaguru.JavaGuruQA2.Lesson4.task2;

public class Square extends AbstractShape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
