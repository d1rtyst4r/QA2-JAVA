package lv.javaguru.JavaGuruQA2.Lesson2.Window;

public class Window {
    double height;
    double length;
    String color;
    boolean isButtonOnWindow;

    public boolean checkButton(){
        return this.isButtonOnWindow;
    }

    public void setHeightLength(double height, double length){
        this.height = height;
        this.length = length;
    }

    public void openWindow(){
        System.out.println("Window is opened!");
    }

    public void closeWindow(){
        System.out.println("Window is closed!");
    }

    public void changeColor(String color){
        this.color = color;
    }
}
