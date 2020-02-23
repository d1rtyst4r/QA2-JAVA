package lv.javaguru.JavaGuruQA2.Lesson2.taskRndNubmerService;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            sum += randomNumber;
            System.out.println(randomNumber);
        }

        System.out.println(sum);
    }
}
