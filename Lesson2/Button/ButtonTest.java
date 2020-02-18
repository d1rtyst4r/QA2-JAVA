package lv.javaguru.JavaGuruQA2.Lesson2.Button;

public class ButtonTest {
    public static void main(String[] args){
        Button firstButton = new Button(1, "red", 15, 25);
        firstButton.changeButtonPosition(45,25);
        firstButton.setColor("blue");
        firstButton.pressButton();
        firstButton.showPositionOnWindow();
    }
}
