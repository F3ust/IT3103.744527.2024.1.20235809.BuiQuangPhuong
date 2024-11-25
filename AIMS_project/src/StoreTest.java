public class StoreTest {
    public static void main(String[] args){
        Cart cart = new Cart();
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Warhammer 40K", "Animation", 59.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Metaphor", "Animation", 59.99f);

//        cart.addDigitalVideoDisc(dvd3,dvd5);
//
//        // Output total cost
//        System.out.println("Total cost: " + cart.totalCost() + " BachDT_20225600");
//
//        //Output total cost after remove an item
//        cart.removeDigitalVideoDisc(dvd3);
//        System.out.println("Total cost: " + cart.totalCost() + " BachDT_20225600");
//
//        hust.soict.ite6.aims.media.DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3, dvd4, dvd5};
//        cart.addDigitalVideoDisc(dvdList);
//        //Test the print method
//        cart.printCart();

//        System.out.println("----------------------------------------");
//        cart.searchId(5);
//        //Test the search by title method
//        System.out.println("----------------------------------------");
//        cart.searchTitle("jajaja");
//        System.out.println("----------------------------------------");
//        cart.searchCategory("Act");

        store.addDigitalVideoDisc(dvd1);
        store.removeDigitalVideoDisc(dvd1);
    }
}