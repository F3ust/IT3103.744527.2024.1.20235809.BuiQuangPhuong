import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        Scanner sc = new Scanner(System.in);
        System.out.println("What 's your name ?");
        String strName = sc.nextLine();
        System.out.println("How old are you ?");
        int iAge = sc.nextInt();
        System.out.println("How tall are you (m) ?");
        double dHeight = sc.nextDouble();

        System.out.println("Mrs/Ms. "+strName+", "+iAge+" years old. "+"Your height is "+dHeight+".");
    }
}
