package lv.javaguru.JavaGuruQA2.Lesson6.NumberOfCoins;

import java.util.Scanner;


public class NumberOfCoins {
    public static void main(String[] args) {
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] coinsValues = {0, 0, 0, 0, 0, 0, 0, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount, and I'll return min number and type of coins to get your amount");
        int totalAmount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < coins.length; i++) {
            coinsValues[i] = totalAmount / coins[i];
            totalAmount -= (coins[i] * coinsValues[i]);
        }

        System.out.println("You need:");
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i] + " - " + coinsValues[i]);
        }
    }
}
