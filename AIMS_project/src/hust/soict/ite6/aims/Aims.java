package hust.soict.ite6.aims;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.media.disc.compactDisc.CompactDisc;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        CompactDisc cd1 = new CompactDisc("Idol", "J-Pop", 10.99f, "Yoasobi");
        anOrder.addMedia(cd1);

        Book book1 = new Book("Re:Zero 1", "Light Novel", 8.99f);
        anOrder.addMedia(book1);


        // Bui Quang Phuong 20235809
        Media[] listMedia = new Media[3];
        listMedia[0] = new DigitalVideoDisc("Persona", "Animation", "Atlus", 92, 20.67f);
        listMedia[1] = new CompactDisc("Life is Dash", "J-Pop", 9.99f, "Suzumi Konomi");
        listMedia[2] = new Book("Fate Strange Fake 1", "Light Novel", 3.99f);
        anOrder.addMedia(listMedia);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        anOrder.addMedia(dvd4, dvd5);

        // print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost() + "$");
        System.out.println("Total items: " + anOrder.getQtyOrdered());

        // remove dvd2
        anOrder.removeMedia(dvd5);
        // print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost() + "$");

        anOrder.showCart();
    }
}
