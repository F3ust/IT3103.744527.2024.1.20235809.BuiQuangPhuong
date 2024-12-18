package hust.soict.ite6.screen;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.disc.compactDisc.CompactDisc;
import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart) {
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);

        this.setSize(new Dimension(1024, 768));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/ite6/screen/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart); // Pass the cart object
                    loader.setController(controller); // Set the controller programmatically
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    fxPanel.setScene(scene);


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        // Compact Discs
        CompactDisc cd1 = new CompactDisc("P3 Reload OST", "Music", 10.99f, "Atlus", 180, "Atlus");
        CompactDisc cd2 = new CompactDisc("Phuongbq235809", "Pop", 12.99f, "Fuon", 170, "Fuon");
        CompactDisc cd3 = new CompactDisc("Nightcore Hits", "Remix", 8.99f, "Various Artists", 200, "Various");
        CompactDisc cd4 = new CompactDisc("Jazz Vibes", "Jazz", 14.99f, "Norah Jones", 240, "Norah Jones");
        CompactDisc cd5 = new CompactDisc("Epic Classics", "Classical", 9.99f, "Ludwig Orchestra", 120, "Beethoven");

        // DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Winter of Rebirth", "Action", "Atlus", 105, 13.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Persona", "Animation", "Atlus", 92, 20.67f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Metaphor", "Animation", "Atlus", 210, 59.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Warhammer 40K", "Animation", "GW", 250, 59.99f);

        // Book

        Book book1 = new Book("Dune Book", "Sci-fi", 9.99f);
        Book book2 = new Book("1984", "Dystopian", 8.99f);
        Book book3 = new Book("To Kill a Mockingbird", "Classic", 7.99f);
        Book book4 = new Book("The Hobbit", "Fantasy", 10.49f);
        Book book5 = new Book("The Catcher in the Rye", "Classic", 6.99f);

        Cart.addMedia(cd1);
        Cart.addMedia(cd2);
        Cart.addMedia(cd3);

        Cart.addMedia(dvd1);
        Cart.addMedia(dvd2);
        Cart.addMedia(dvd3);

        Cart.addMedia(book1);
        Cart.addMedia(book2);

        new CartScreen(cart);
    }
}