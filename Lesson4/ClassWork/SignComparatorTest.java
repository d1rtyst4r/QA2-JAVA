package lv.javaguru.JavaGuruQA2.Lesson4.ClassWork;

class SignComparatorTest {

    public static void main(String[] args) {
        SignComparatorTest testRun = new SignComparatorTest();
        testRun.shouldReturnNumberIsPositiveWhenNumber1();
        testRun.shouldReturnNumberEqualsZeroWhenNumber0();
        testRun.shouldReturnNumberIsNegativeWhenNumberMinus1();
    }

    void shouldReturnNumberIsPositiveWhenNumber1() {
        SignComparator comparator = new SignComparator();
        int testNUmber = 1;
        String expectedResult = "Number is positive";
        if (expectedResult.equals(comparator.compare(testNUmber))) {
            System.out.println("shouldReturnNumberIsPositiveWhenNumber1: SUCCESS");
        } else {
            System.out.println("shouldReturnNumberIsPositiveWhenNumber1: FAILED");
        }
    }

    void shouldReturnNumberEqualsZeroWhenNumber0() {
        SignComparator comparator = new SignComparator();
        int testNUmber = 0;
        String expectedResult = "Number is equal to zero";
        if (expectedResult.equals(comparator.compare(testNUmber))) {
            System.out.println("shouldReturnNumberIsPositiveWhenNumber0: SUCCESS");
        } else {
            System.out.println("shouldReturnNumberIsPositiveWhenNumber0: FAILED");
        }
    }

    void shouldReturnNumberIsNegativeWhenNumberMinus1() {
        SignComparator comparator = new SignComparator();
        int testNUmber = -1;
        String expectedResult = "Number is negative";
        if (expectedResult.equals(comparator.compare(testNUmber))) {
            System.out.println("shouldReturnNumberIsPositiveWhenNumberMinus1: SUCCESS");
        } else {
            System.out.println("shouldReturnNumberIsPositiveWhenNumberMinus1: FAILED");
        }
    }
}
