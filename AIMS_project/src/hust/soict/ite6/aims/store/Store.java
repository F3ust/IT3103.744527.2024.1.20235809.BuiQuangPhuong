package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.media.disc.DigitalVideoDisc;

public class Store {
    private int currentItemsNumber = 0;
    public static final int MAX_ITEMS_NUMBERED = 100;
    private final DigitalVideoDisc[] itemsAvailable = new DigitalVideoDisc[MAX_ITEMS_NUMBERED];

    //Bui Quang Phuong 20235809
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        System.out.println();
        if(currentItemsNumber >= 98){
            System.out.println("The hust.soict.ite6.aims.store.hust.soict.ite6.aims.store.Store is almost full");
        }
        if(currentItemsNumber < MAX_ITEMS_NUMBERED){
            itemsAvailable[currentItemsNumber] = disc;
            currentItemsNumber++;
            System.out.println("Added " + disc.getTitle() +" successfully");
            System.out.println("Current available Item: " + currentItemsNumber + "/100 items");
        }else{
            System.out.println("The store is already full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i = 0; i < currentItemsNumber; i++){
            if(itemsAvailable[i].equals(disc)){ //find the item
                for(int j = i; j < currentItemsNumber; j++){ //shift items to the left to fill the gap
                    itemsAvailable[j] = itemsAvailable[j+1];
                }
                itemsAvailable[currentItemsNumber - 1] = null; //clear the last spot
                currentItemsNumber--; // reduce qtyOrdered
                System.out.println("Removed " + disc.getTitle() +" successfully");
                System.out.println("Current cart: " + currentItemsNumber + "/100 items");
            }
        }
    }

}