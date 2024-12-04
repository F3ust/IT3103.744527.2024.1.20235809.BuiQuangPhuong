package hust.soict.ite6.aims.media.disc;

// Bui Quang Phuong 20235809

import hust.soict.ite6.aims.media.Media;
import hust.soict.ite6.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable {


    public DigitalVideoDisc() {

    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public DigitalVideoDisc(String title, float cost) {
        super(title, cost);
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }


}
