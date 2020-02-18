package lv.javaguru.JavaGuruQA2.Lesson5.ClassWorks;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start <= start) {
            for (int i = start; i <= finish; i++) {
                sum += i;
                ;
            }
        }if (start > finish){
            for (int i = finish; i <= start; i++){
                sum += i;
            }
        }
        return sum;
    }
    public int rangeEvenCount(int start, int finish) {
        int evenCounter = 0;
        if (start <= finish){
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    evenCounter += 1;
                }
            }
        } if (start >= finish){
            for (int i = finish; i <= start; i++){
                if (i % 2 == 0){
                    evenCounter +=1;
                }
            }
        }
        return evenCounter;
    }

}
