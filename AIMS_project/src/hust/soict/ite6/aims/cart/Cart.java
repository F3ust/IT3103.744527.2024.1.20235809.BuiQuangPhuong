package hust.soict.ite6.aims.cart;

import hust.soict.ite6.aims.media.DigitalVideoDisc;

//Bui Quang Phuong 20235809
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc (DigitalVideoDisc disc){
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered += 1;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) { // Bui Quang Phuong 20235809
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered[qtyOrdered] = disc1;
        qtyOrdered += 1;
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered[qtyOrdered] = disc2;
        qtyOrdered += 1;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) { // Bui Quang Phuong 20235809
        for (DigitalVideoDisc disc : dvdList) {
            // Assuming hust.soict.ite6.aims.cart.Cart class handles this method to add DVDs
            if (qtyOrdered > MAX_NUMBERS_ORDERED) {
                System.out.println("MAX NUMBERS ORDERED REACHED");
                return;
            }
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered += 1;
        }
    }
    public void removeDigitalVideoDisc (DigitalVideoDisc disc){
        for (int i = 0; i <= qtyOrdered-1; ++i) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j <= qtyOrdered-2; ++j) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered -= 1;
            }
        }
    }
    public float totalCost() {
        float sum = 0.0f;
        for (int i = 0; i <= qtyOrdered-1; ++i) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void showCart() {
        System.out.println("\n***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.qtyOrdered ; i++) {
            System.out.println((i + 1) + ". " + this.itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }
}
