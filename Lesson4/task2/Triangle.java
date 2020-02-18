package lv.javaguru.JavaGuruQA2.Lesson4.ClassWork.task2;

import java.lang.Math;

public class Triangle extends AbstractShape {

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        double halfPerimeter = 0.5 * (firstSide + secondSide + thirdSide);
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) *
                (halfPerimeter - thirdSide));
        return area;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
