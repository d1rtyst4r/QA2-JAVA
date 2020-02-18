package lv.javaguru.JavaGuruQA2.Lesson5.ClassWorks;

public class NumberServiceDemo {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        int sum = numberService.rangeSum(0, 10);
        System.out.println(sum);
        sum = numberService.rangeSum(10,0);
        System.out.println(sum);

        sum = numberService.rangeSum(5,5);
        System.out.println(sum);

        int evenNumbers = numberService.rangeEvenCount(0,10);
        System.out.println(evenNumbers);
    }
}
