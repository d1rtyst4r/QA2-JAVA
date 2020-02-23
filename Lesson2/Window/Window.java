package lv.javaguru.JavaGuruQA2.Lesson2.Window;

import lv.javaguru.JavaGuruQA2.Lesson2.Button.Button;

public class Window {
    double height;
    double length;
    String color;
    boolean isButtonOnWindow;
    Button[] button;

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

    public void turnOnButtonOnWindow(){
        System.out.println("Button is turn on.");
    }

    public void turnOffButtonOnWindow(){
        System.out.println("Button is turn off.");
    }
}
