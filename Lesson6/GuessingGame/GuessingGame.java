package lv.javaguru.JavaGuruQA2.Lesson6.GuessingGame;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Please guess your number from 1 to 100!");
        System.out.println("I'll try guess it! Please enter 1 if your number is bigger than my, if smaller press 2" +
                "and if I guess it press 0!");
        System.out.println("Lets play!");

        int stopGame = 0;
        int playerNUmberIsBigger = 1;
        int getPlayerNUmberIsSmaller = 2;
        int minNumber = 1;
        int maxNUmber = 101;
        boolean continueGame = true;
        int answer = 50;

        Scanner scanner = new Scanner(System.in);

        while (continueGame) {
            System.out.println("Is it your number? " + answer);
            int playerAnswer = Integer.parseInt(scanner.nextLine());
            if (playerAnswer == playerNUmberIsBigger) {
                minNumber = answer;
                answer = (maxNUmber + minNumber) / 2;
            }
            if (playerAnswer == getPlayerNUmberIsSmaller) {
                maxNUmber = answer;
                answer = (maxNUmber + minNumber) / 2;
            }
            if (playerAnswer == stopGame) {
                System.out.println("Your number was: " + answer);
                continueGame = false;
            }
        }
    }


}
