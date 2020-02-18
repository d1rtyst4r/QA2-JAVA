import java.util.Scanner;
public class ReadLineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter something: ");
        String text = sc.nextLine();
        System.out.println(text);
        int textToInteger = Integer.parseInt(text);
        System.out.println(textToInteger);

        if (text.equals("123")){
            System.out.println("True");
        }
        else System.out.println("false");
    }
}
