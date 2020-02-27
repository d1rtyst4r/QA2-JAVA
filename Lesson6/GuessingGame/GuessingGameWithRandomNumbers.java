package lv.javaguru.JavaGuruQA2.Lesson6.GuessingGame;

import java.util.Scanner;

public class GuessingGameWithRandomNumbers {
    public static void main(String[] args) {
        System.out.println("Please guess your number from 1 to 100!");
        System.out.println("I'll try guess it! Please enter 1 if your number is bigger than my, if smaller press 2" +
                "and if I guess it press 0!");
        System.out.println("Lets play!");
        Scanner scanner = new Scanner(System.in);

        int stopGame = 0;
        int playerNUmberIsBigger = 1;
        int getPlayerNUmberIsSmaller = 2;
        int minNumber = 0;
        int maxNUmber = 101;
        boolean continueGame = true;
        int answer = (int) (Math.random() * maxNUmber);


        while (continueGame) {
            System.out.println("Is it your number? " + answer);
            int playerAnswer = Integer.parseInt(scanner.nextLine());
            if (playerAnswer == playerNUmberIsBigger) {
                minNumber = answer + 1;
                answer = (int) (Math.random() * (maxNUmber - minNumber) + minNumber);
            }
            if (playerAnswer == getPlayerNUmberIsSmaller) {
                maxNUmber = answer;
                answer = answer = (int) (Math.random() * (maxNUmber - minNumber) + minNumber);
            }
            if (playerAnswer == stopGame) {
                System.out.println("Your number was: " + answer);
                continueGame = false;
            }
        }
    }
}
