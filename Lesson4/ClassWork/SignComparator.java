package lv.javaguru.JavaGuruQA2.Lesson4.ClassWork;

public class SignComparator {
    public String compare(int number){
        if (number > 0){
            return "Number is positive";
        }
        if (number < 0){
            return "Number is negative";
        }
        return "Number is equal to zero";
    }
}
