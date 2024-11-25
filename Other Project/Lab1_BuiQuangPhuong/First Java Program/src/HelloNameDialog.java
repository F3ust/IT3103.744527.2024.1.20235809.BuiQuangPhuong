import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        String result = JOptionPane.showInputDialog("Bui Quang Phuong - 20235809 - Please enter your name");
        JOptionPane.showMessageDialog(null, "Bui Quang Phuong - 20235809 - Hi " + result + " !");
        System.exit(0);
    }
}
