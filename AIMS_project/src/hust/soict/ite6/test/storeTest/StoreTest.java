package hust.soict.ite6.test.storeTest;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);

//        Bui Quang Phuong 20235809

        store.addDigitalVideoDisc(dvd1);
        store.removeDigitalVideoDisc(dvd1);
        System.out.println("Bui Quang Phuong 20235809");
    }
}