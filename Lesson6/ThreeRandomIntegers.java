package lv.javaguru.JavaGuruQA2.Lesson6;

import java.util.Random;

public class ThreeRandomIntegers {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstNUmber = randomGenerator.nextInt(100);
        int secondNumber = randomGenerator.nextInt(100);
        int thirdNumber = randomGenerator.nextInt(100);
        System.out.println("First number is: " + firstNUmber + ", second number is: " + secondNumber +
                ", third number is: " + thirdNumber);
    }
}
