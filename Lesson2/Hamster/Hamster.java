package lv.javaguru.JavaGuruQA2.Lesson2.Hamster;

public class Hamster {

    String name;
    double weight;
    int age;
    String color;

    public Hamster(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public Hamster(String name, double weight, int age, String color){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void eat(double foodWeight){
        weight += foodWeight;
    }
}
