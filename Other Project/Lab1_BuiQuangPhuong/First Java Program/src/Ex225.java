import javax.swing.JOptionPane;

public class Ex225 {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        String strNotification = "Bui Quang Phuong - 20235809\n";
        JOptionPane.showMessageDialog(null, strNotification +
                "Sum: " + (num1 + num2) + "\n" +
                "Difference: " + (num1 - num2) + "\n" +
                "Product: " + (num1 * num2) + "\n" +
                "Quotient: " + (num1 / num2) + "\n"
                , "Bui Quang Phuong - 20235809 - Show calc", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
