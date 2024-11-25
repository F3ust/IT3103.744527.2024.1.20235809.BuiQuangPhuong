package hust.soict.ite6.aims;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc[] listDvd = new DigitalVideoDisc[3];
        listDvd[0] = new DigitalVideoDisc("Persona", "Animation", "Atlus", 92, 20.67f);
        listDvd[1] = new DigitalVideoDisc("86", "Animation", "b", 86, 16.86f);
        listDvd[2] = new DigitalVideoDisc("Sword art online", "Animation", "a", 107, 21.56f);
        anOrder.addDigitalVideoDisc(listDvd);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        anOrder.addDigitalVideoDisc(dvd4, dvd5);

        // print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost() + "$");

        // remove dvd2
        anOrder.removeDigitalVideoDisc(dvd2);
        // print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost() + "$");

        anOrder.showCart();
    }
}
