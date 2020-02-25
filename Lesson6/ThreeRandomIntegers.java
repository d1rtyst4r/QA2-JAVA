package lv.javaguru.JavaGuruQA2.Lesson6;

import java.util.Random;

public class ThreeRandomIntegers {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int numberOnFirstDice = randomGenerator.nextInt(6);
        int numberOnSecondDice = randomGenerator.nextInt(6);
        int numberOnThirdDice = randomGenerator.nextInt(6);
        if (numberOnFirstDice == numberOnSecondDice && numberOnSecondDice == numberOnThirdDice){
            System.out.println("You have Win!!! you have " + numberOnFirstDice + "on all dices.");
        }
    }
}
