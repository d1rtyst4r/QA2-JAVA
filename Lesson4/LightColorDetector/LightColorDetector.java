package lv.javaguru.JavaGuruQA2.Lesson4.LightColorDetector;

public class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength < 380) {
            return "Invisible Light";
        }
        if (wavelength < 450) {
            return "Violet";
        }
        if (wavelength < 495) {
            return "Blue";
        }
        if (wavelength < 570) {
            return "Green";
        }
        if (wavelength < 590) {
            return "Yellow";
        }
        if (wavelength < 620) {
            return "Orange";
        }
        if (wavelength <= 750) {
            return "Red";
        }
        return "Invisible Light";
    }
}
