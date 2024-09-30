import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        System.out.print("Please enter month and year: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int year = sc.nextInt();
        month = month.toLowerCase();
        if (year > 0) {
            if (month.equals("january") || month.equals("march")|| month.equals("may")|| month.equals("july") || month.equals("august")|| month.equals("october") || month.equals("december")) {
                System.out.println(31);
                System.exit(0);
            }
            if (month.equals("jan") || month.equals("mar")|| month.equals("jul") || month.equals("aug")|| month.equals("oct") || month.equals("dec")) {
                System.out.println(31);
                System.exit(0);
            }
            if (month.equals("jan.") || month.equals("mar.")|| month.equals("jul.") || month.equals("aug.")|| month.equals("oct.") || month.equals("dec.")) {
                System.out.println(31);
                System.exit(0);
            }
            if (month.equals("1") || month.equals("3")|| month.equals("7") || month.equals("8")|| month.equals("10") || month.equals("12")) {
                System.out.println(31);
                System.exit(0);
            }
            if (month.equals("april") || month.equals("june")|| month.equals("september") || month.equals("november")) {
                System.out.println(30);
                System.exit(0);
            }
            if (month.equals("apr") || month.equals("jun")|| month.equals("sep") || month.equals("nov")) {
                System.out.println(30);
                System.exit(0);
            }
            if (month.equals("apr.") || month.equals("jun.")|| month.equals("sep.") || month.equals("nov.")) {
                System.out.println(30);
                System.exit(0);
            }
        }
        if (month.equals("february") || month.equals("feb")|| month.equals("feb.") || month.equals("2")) {
            if (year > 0) {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(29);
                    System.exit(0);
                } else {
                    System.out.println(28);
                    System.exit(0);
                }
            }
        }
        System.out.println("Month or year is invalid");
        main(new String[] {"Re-enter"});
    }
}