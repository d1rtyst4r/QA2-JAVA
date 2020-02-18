package lv.javaguru.lesson3.lv.javaguru.homework2.task1;

import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        //to do
        int[] createdArray = new int[size];
        return createdArray;
    }

    public void fillRandomly(int[] array) {
        // TODO
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
        for (int n = 0; n < array.length; n++) {
            summma += array[n];
        }
        return summma;
    }

    public double avg(int[] array) {

        int sum = sum(array);
        double average = sum / (double) array.length;
        return average;
    }
}
