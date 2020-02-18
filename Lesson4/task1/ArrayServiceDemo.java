package lv.javaguru.lesson3.lv.javaguru.homework2.task1;

public class ArrayServiceDemo {

    public static void main(String[] args) {

        // Demo for filled array
        ArrayService arrayService = new ArrayService();
        int[] arrayForArrayServiceDemo = arrayService.create(100);
        arrayService.fillRandomly(arrayForArrayServiceDemo);
        arrayService.printArray(arrayForArrayServiceDemo);
        int sumForDemo = arrayService.sum(arrayForArrayServiceDemo);
        System.out.println("Sum of all numbers in array is: " + sumForDemo);
        double average = arrayService.avg(arrayForArrayServiceDemo);
        System.out.println("Average of all numbers in array is: " + average);
        System.out.println();

        // Demo for empty array
        int[] EmptyArrayDemo = arrayService.create(100);
        arrayService.printArray(EmptyArrayDemo);
        sumForDemo = arrayService.sum(EmptyArrayDemo);
        System.out.println("Sum of all numbers in array is: " + sumForDemo);
        average = arrayService.avg(EmptyArrayDemo);
        System.out.println("Average of all numbers in array is: " + average);
    }
}

