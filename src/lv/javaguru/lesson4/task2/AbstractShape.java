package lv.javaguru.lesson4.task2;

public class AbstractShape implements Shape {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getArea() {
        return 0;
    }

    public int numberOfSides() {
        return 0;
    }

}


interface Shape {
    String getName();

    double getArea();
}