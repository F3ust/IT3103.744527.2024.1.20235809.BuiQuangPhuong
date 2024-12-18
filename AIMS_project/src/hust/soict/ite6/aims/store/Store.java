package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Objects;

public class Store {
    private int currentItemsNumber = 0;
    public static final int MAX_ITEMS_NUMBERED = 100;
    private final ArrayList<Media> itemsAvailable = new ArrayList<Media>();

    public ArrayList<Media> getItemsAvailable() {
        return itemsAvailable;
    }

    //Bui Quang Phuong 20235809
    public void addMedia(Media media) {
        System.out.println();
        if(currentItemsNumber >= 98){
            System.out.println("The Store is almost full");
        }
        if(currentItemsNumber < MAX_ITEMS_NUMBERED){
            itemsAvailable.add(media);
            currentItemsNumber++;
            System.out.println("Added " + media.getTitle() +" successfully");
            System.out.println("Current available Item: " + currentItemsNumber + "/100 items");
        }else{
            System.out.println("The store is already full");
        }
    }

    public void removeMedia(Media media){
        for(int i = 0; i < currentItemsNumber; i++){
            if(Objects.equals(itemsAvailable.get(i), media)){ //find the item
                itemsAvailable.remove(media);
                --currentItemsNumber; // reduce qtyOrdered
                System.out.println("Removed " + media.getTitle() +" successfully");
                System.out.println("Current cart: " + currentItemsNumber + "/100 items");
            }
        }
    }
    public void showStore() {
        System.out.println("\n***********************STORE***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < currentItemsNumber ; i++) {
            System.out.println((i + 1) + ". " + this.itemsAvailable.get(i).toString());
        }
        System.out.println("**************************************************");
    }

    public Media findMediaByTitle(String titleToPlay) {
        for (int i = 0; i < currentItemsNumber; i++) {
            if (isMatch(itemsAvailable.get(i).getTitle(), titleToPlay)) {
                System.out.println(itemsAvailable.get(i).toString());
                return itemsAvailable.get(i);
            }
        }
        return null;
    }

    public boolean isMatch(String mediaTitle, String inputTitle) {
        return mediaTitle.contains(inputTitle);
    }

}