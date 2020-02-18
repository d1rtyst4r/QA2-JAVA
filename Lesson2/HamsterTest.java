package lv.javaguru.Lesson2;

public class HamsterTest {
    public static void main(String[] args){
        Hamster firstHamster = new Hamster("Tolik",100.0);

        firstHamster.eat(50.0);
        System.out.println(firstHamster.weight);
    }
}
