import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        String strNotification = "Bui Quang Phuong - 20235809 - You just entered ";
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Bui Quang Phuong - 20235809 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
