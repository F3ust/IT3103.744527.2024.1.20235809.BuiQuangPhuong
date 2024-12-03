package hust.soict.ite6.aims.cart;

import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

import static hust.soict.ite6.aims.media.Media.COMPARE_BY_COST_TITLE;
import static hust.soict.ite6.aims.media.Media.COMPARE_BY_TITLE_COST;

//Bui Quang Phuong 20235809
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int qtyOrdered;

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addMedia (Media media){
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered.add(media);
        System.out.println("Product " + media.getTitle() + " added successfully");
        qtyOrdered += 1;
    }
    public void addMedia(Media media1, Media media2) { // Bui Quang Phuong 20235809
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered.add(media1);
        System.out.println("Product " + media1.getTitle() + " added successfully");
        qtyOrdered += 1;
        if (qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("MAX NUMBERS ORDERED REACHED");
            return;
        }
        itemsOrdered.add(media2);
        System.out.println("Product " + media2.getTitle() + " added successfully");
        qtyOrdered += 1;
    }
    public void addMedia(Media[] mediaList) { // Bui Quang Phuong 20235809
        for (Media media : mediaList) {
            // Assuming hust.soict.ite6.aims.cart.Cart class handles this method to add DVDs
            if (qtyOrdered > MAX_NUMBERS_ORDERED) {
                System.out.println("MAX NUMBERS ORDERED REACHED");
                return;
            }
            itemsOrdered.add(media);
            System.out.println("Product " + media.getTitle() + " added successfully");
            qtyOrdered += 1;
        }
    }
    public void removeMedia (Media media){
        for (int i = 0; i <= qtyOrdered-1; ++i) {
            if (Objects.equals(itemsOrdered.get(i), media)) {
                itemsOrdered.remove(media);
                System.out.println("Product " + media.getTitle() + " removed successfully");
                qtyOrdered -= 1;
            }
        }
    }
    public float totalCost() {
        float sum = 0.0f;
        for (int i = 0; i <= qtyOrdered-1; ++i) {
            Media tmp = itemsOrdered.get(i);
            sum += tmp.getCost();
        }
        return sum;
    }
    //Bui Quang Phuong 20235809
    public void showCart() {
        System.out.println("\n***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.qtyOrdered ; i++) {
            System.out.println((i + 1) + ". " + this.itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    public void searchId(int id) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        // Bui Quang Phuong 20235809
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (id == itemsOrdered.get(i).getId()) {
                System.out.println(this.itemsOrdered.get(i).toString());
                System.out.println("------------------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching titles found for \"" + id + "\".");
        }
    }
    // Bui Quang Phuong 20235809
    public void searchTitle(String userTitle) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (isMatch(itemsOrdered.get(i).getTitle(), userTitle)) {
                System.out.println(this.itemsOrdered.get(i).toString());
                System.out.println("------------------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching titles found for \"" + userTitle + "\".");
        }
    }

    public Media searchByTitle(String titleToPlay) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (isMatch(itemsOrdered.get(i).getTitle(), titleToPlay)) {
                return itemsOrdered.get(i);
            }
        }
        return null;
    }
    // Bui Quang Phuong 20235809
    public boolean isMatch(String mediaTitle, String inputTitle) {
        return mediaTitle.contains(inputTitle);
    }

    public void searchCategory(String userCategory) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (isMatchCate(itemsOrdered.get(i).getCategory(), userCategory)) {
                System.out.println(this.itemsOrdered.get(i).toString());
                System.out.println("------------------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching titles found for \"" + userCategory + "\".");
        }
    }
    // Bui Quang Phuong 20235809
    public boolean isMatchCate(String mediaCategory, String inputCategory) {
        return mediaCategory.contains(inputCategory);
    }

    public Media searchID(int userID) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (Objects.equals(itemsOrdered.get(i).getId(), userID)) {
                return itemsOrdered.get(i);
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrdered.clear();
    }

    public void sortCartByTitleAndCost() {
        itemsOrdered.sort(COMPARE_BY_TITLE_COST);
    }

    public void sortCartByCostAndTitle() {
        itemsOrdered.sort(COMPARE_BY_COST_TITLE);
    }

}


