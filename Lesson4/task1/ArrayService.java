package lv.javaguru.JavaGuruQA2.Lesson4.task1;

import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random rnd = new Random();

        for (int n = 0; n < array.length; n++) {
            array[n] = rnd.nextInt(101);
        }
    }

    public void printArray(int[] array) {
        System.out.print("array = [");
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + ", ");
            if (n == array.length - 1) {
                System.out.println(array[n] + "]");
            }
        }
    }

    public int sum(int[] array) {

        int summma = 0;
        for (int i : array) {
            summma += i;
        }
        return summma;
    }

    public double avg(int[] array) {

        return sum(array) / (double) array.length;
    }
}
