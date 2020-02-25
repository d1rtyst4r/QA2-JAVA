package lv.javaguru.JavaGuruQA2.Lesson6;

import java.util.Random;

public class ThreeRandomIntegers {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        for (int i = 0; i < 3; i++){
           System.out.println(randomGenerator.nextInt(100));
        }
    }
}
