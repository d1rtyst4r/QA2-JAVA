package lv.javaguru.JavaGuruQA2.Lesson4.LightColorDetector;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRun = new LightColorDetectorTest();
        testRun.shouldReturnVioletWhenWaveIs380();
        testRun.shouldReturnVioletWhenWaveIs449();
        testRun.shouldReturnBlueWhenWaveIs450();
        testRun.shouldReturnBlueWhenWaveIs494();
        testRun.shouldReturnGreenWhenWaveIs495();
        testRun.shouldReturnGreenWhenWaveIs569();
        testRun.shouldReturnYellowWhenWaveIs570();
        testRun.shouldReturnYellowWhenWaveIs589();
        testRun.shouldReturnOrangeWhenWaveIs590();
        testRun.shouldReturnOrangeWhenWaveIs619();
        testRun.shouldReturnRedWhenWaveIs620();
        testRun.shouldReturnRedWhenWaveIs750();
        testRun.shouldReturnInvisibleLightWhenWaveIs379();
        testRun.shouldReturnInvisibleLightWhenWaveIs751();
    }

    public void shouldReturnVioletWhenWaveIs380() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(380);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test is shouldReturnVioletWhenWaveIs380 passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnVioletWhenWaveIs380 is failed.");
        }
    }

    public void shouldReturnVioletWhenWaveIs449() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(449);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnVioletWhenWaveIs449 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnVioletWhenWaveIs449 is failed.");
        }
    }

    public void shouldReturnBlueWhenWaveIs450() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(450);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnBlueWhenWaveIs450 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnBlueWhenWaveIs450 is failed.");
        }
    }

    public void shouldReturnBlueWhenWaveIs494() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(494);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnBlueWhenWaveIs494 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnBlueWhenWaveIs494 is failed.");
        }
    }

    public void shouldReturnGreenWhenWaveIs495() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(495);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnGreenWhenWaveIs495 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnGreenWhenWaveIs495 is failed.");
        }
    }

    public void shouldReturnGreenWhenWaveIs569() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(569);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnGreenWhenWaveIs569 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnGreenWhenWaveIs569 is failed.");
        }
    }

    public void shouldReturnYellowWhenWaveIs570() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(570);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnYellowWhenWaveIs570 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnYellowWhenWaveIs570 is failed.");
        }
    }

    public void shouldReturnYellowWhenWaveIs589() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(589);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnYellowWhenWaveIs589 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnYellowWhenWaveIs589 is failed.");
        }
    }

    public void shouldReturnOrangeWhenWaveIs590() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(590);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnOrangeWhenWaveIs590 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnOrangeWhenWaveIs590 is failed.");
        }
    }

    public void shouldReturnOrangeWhenWaveIs619() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(619);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnOrangeWhenWaveIs619 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnOrangeWhenWaveIs619 is failed.");
        }
    }

    public void shouldReturnRedWhenWaveIs620() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(620);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnRedWhenWaveIs620 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnRedWhenWaveIs620 is failed.");
        }
    }

    public void shouldReturnRedWhenWaveIs750() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(750);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnRedWhenWaveIs750 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnRedWhenWaveIs750 is failed.");
        }
    }

    public void shouldReturnInvisibleLightWhenWaveIs379() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(379);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnInvisibleLightWhenWaveIs379 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnInvisibleLightWhenWaveIs379 is failed.");
        }
    }

    public void shouldReturnInvisibleLightWhenWaveIs751() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(751);
        if (expectedResult.equals(actualResult)) {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnInvisibleLightWhenWaveIs751 is passed.");
        } else {
            System.out.println("Actual result is: " + actualResult + ", " + "expected result is : " +
                    expectedResult + " Test shouldReturnInvisibleLightWhenWaveIs751 is failed.");
        }
    }
}
