package hust.soict.ite6.aims;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Playable;
import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.media.disc.compactDisc.CompactDisc;
import hust.soict.ite6.aims.store.Store;
import hust.soict.ite6.screen.CartScreen;
import hust.soict.ite6.screen.StoreScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Aims {

    Scanner scanner = new Scanner(System.in);
    private static Scanner sc;
    private static Store store;
    private static Cart cart;
    private static StoreScreen storeScreen;
    private static CartScreen cartScreen;
    //Bui Quang Phuong 20235809
    public static void main(String[] args) {
        store = new Store();
        cart = new Cart();
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


        // Add to store

        store.addMedia(cd1);
        store.addMedia(cd2);
        //store.addMedia(cd3);
        //store.addMedia(cd4);
        //store.addMedia(cd5);

        //store.addMedia(dvd1);
        store.addMedia(dvd2);
        //store.addMedia(dvd3);
        store.addMedia(dvd4);
        //store.addMedia(dvd5);

        store.addMedia(book1);
        store.addMedia(book2);
        //store.addMedia(book3);
        //store.addMedia(book4);
        //store.addMedia(book5);
        openStoreScreen();
    }

    public static Store getStore() {
        return store;
    }

    public static Cart getCart() {
        return cart;
    }

    public static StoreScreen getStoreScreen() {
        return storeScreen;
    }

    public static CartScreen getCartScreen() {
        return cartScreen;
    }

    public static void openStoreScreen() {
        storeScreen = new StoreScreen(store);
    }

    public static void closeStoreScreen() {
        storeScreen.setVisible(false);
        storeScreen = null;
    }

    public static void openCartScreen() {
        cartScreen = new CartScreen(cart);
    }

    public static void closeCartScreen() {
        cartScreen.setVisible(false);
        cartScreen = null;
    }
}
