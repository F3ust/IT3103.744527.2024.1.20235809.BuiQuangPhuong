package hust.soict.ite6.test.cartTest;

import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {

        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);


        cart.addDigitalVideoDisc(dvd1);
        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Bui Quang Phuong 20235809");
    }
}