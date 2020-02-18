package lv.javaguru.JavaGuruQA2.Lesson2.Window;

public class WindowTest {
    public static void main(String[] args) {
        Window firstWindow = new Window();
        firstWindow.changeColor("white");
        firstWindow.openWindow();
        firstWindow.closeWindow();
        firstWindow.setHeightLength(13, 16);
    }
}
