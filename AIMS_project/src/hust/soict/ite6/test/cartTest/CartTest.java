package hust.soict.ite6.test.cartTest;

import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {

        //Bui Quang Phuong 20235809
        // Test -
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Metaphor Refantazio", "Animation", "Atlus", 123, 59.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Warhammer 40K", "Sci-Fi", "Game workshop",117, 59.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Titanic", "Romance", "James Cameroon", 195, 19.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 29.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Sword Art Online", "Animation", "A1", 134, 49.99f);


        DigitalVideoDisc[]  dvdList = {dvd1,dvd2, dvd3, dvd4, dvd5};
        cart.addDigitalVideoDisc(dvdList);
        cart.showCart();
        System.out.println("Bui Quang Phuong 20235809");
    }
}