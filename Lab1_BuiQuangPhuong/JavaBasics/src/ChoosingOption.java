import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to first class ticket?");
        JOptionPane.showMessageDialog(null, "You have chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}