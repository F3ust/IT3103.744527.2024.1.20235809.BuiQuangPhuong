package hust.soict.ite6.screen;

import hust.soict.ite6.aims.Aims;
import hust.soict.ite6.aims.media.*;
import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.media.disc.Disc;
import hust.soict.ite6.aims.media.disc.compactDisc.CompactDisc;
import hust.soict.ite6.exception.DuplicatedItemException;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailScreen extends JFrame {
    private Media media;
    public DetailScreen(Media media) {
        super("Details");
        this.media = media;
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(10, 10)));
        displayInformation();
        add(Box.createVerticalGlue());
        addButtons();
        add(Box.createRigidArea(new Dimension(10, 5)));
        setBounds(450, 200, 300, 350);
        setVisible(true);
    }
    void displayInformation() {
        addInfoLine("Media type:", media instanceof DigitalVideoDisc ? "Digital Video Disc"
                : media instanceof CompactDisc ? "Compact Disc" : "Book");
        addInfoLine("Title:", media.getTitle());
        addInfoLine("Category:", media.getCategory());
        if (media instanceof CompactDisc) {
            addInfoLine("Artist:", ((CompactDisc) media).getArtist());
        }
        if (media instanceof Disc) {
            addInfoLine("Director:", ((Disc) media).getDirector());
            addInfoLine("Length:", ((Disc) media).getLength() + " m.");
        }
        if (media instanceof CompactDisc) {
            addInfoLine("Number of tracks:", ((CompactDisc) media).getTracks().size() + "");
        }
        if (media instanceof Book) {
            addInfoLine("Author(s):", String.join(", ", ((Book) media).getAuthors()));
        }

        addInfoLine("Cost:", String.format("%.2f $", media.getCost()));
    }
    void addInfoLine(String label, String info) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        JLabel lblLabel = new JLabel(label);
        lblLabel.setFont(new Font(lblLabel.getFont().getName(), Font.BOLD, 12));
        panel.add(lblLabel);
        JLabel lblInfo = new JLabel((info == null || info.equals("")) ? "Unknown" : info);
        lblInfo.setFont(new Font(lblInfo.getFont().getName(), Font.PLAIN, 12));
        panel.add(lblInfo);
        add(panel);
    }
    void addButtons() {
        JPanel panel = new JPanel(new FlowLayout());
        JButton btnAddToCart = new JButton("Add to cart");
        btnAddToCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aims.getCart().addMedia(media);
                JOptionPane.showMessageDialog(null,
                        String.format("Added %s to cart.\nCurrent number of items in cart: %d", media.toString(),
                                Aims.getCart().getItemsOrdered().size()));
            }
        });
        panel.add(btnAddToCart);
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(btnCancel);
        add(panel);
    }
}