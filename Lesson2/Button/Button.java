package lv.javaguru.JavaGuruQA2.Lesson2.Button;

public class Button {
    private int id;
    private String color;
    private int height;
    private int length;
    private int xPositionOnPage;
    private int yPositionOnPage;
    private String messageAfterPress = "You press me!";

    public Button(int id, String color, int height, int length) {
        this.id = id;
        this.color = color;
        this.height = height;
        this.length = length;
    }

    public Button(int id, String color, int height, int length, int xPositionOnPage, int yPositionOnPage) {
        this.id = id;
        this.color = color;
        this.height = height;
        this.length = length;
        this.xPositionOnPage = xPositionOnPage;
        this.yPositionOnPage = yPositionOnPage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void changeButtonPosition(int xPosition, int yPosition) {
        xPositionOnPage = xPosition;
        yPositionOnPage = yPosition;
    }

    public void pressButton() {
        System.out.println(messageAfterPress);
    }

    public void showPositionOnWindow() {
        System.out.println("Button position is: " + xPositionOnPage + "," + yPositionOnPage + ".");
    }
}
