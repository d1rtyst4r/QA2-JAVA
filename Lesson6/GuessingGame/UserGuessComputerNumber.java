package lv.javaguru.JavaGuruQA2.Lesson6.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class UserGuessComputerNumber {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int computerAnswer = random.nextInt(101);
        int numberOfTries = 1;
        boolean continueGame = true;

        System.out.println("Hi, let's play a game. I guess number from 1 to 100, You have to guess it. I'll help you.");

        while (continueGame) {
            System.out.println("Please enter your number: ");
            int playerAnswer = Integer.parseInt(scanner.nextLine());
            if (computerAnswer < playerAnswer) {
                System.out.println("Incorrect, my number is smaller.");
                numberOfTries += 1;
            }
            if (computerAnswer > playerAnswer) {
                System.out.println("Incorrect, my number is bigger.");
                numberOfTries += 1;
            }
            if (computerAnswer == playerAnswer) {

                if (numberOfTries ==1){
                    System.out.println("Correct! You have used only one try.");
                }else {
                    System.out.println("Correct! You have used only " + numberOfTries + " tries.");
                }
                continueGame = false;
            }
        }
    }
}
