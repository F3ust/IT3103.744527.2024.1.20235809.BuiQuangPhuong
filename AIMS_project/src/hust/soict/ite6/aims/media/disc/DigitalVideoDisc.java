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
    @Override
    public int compareTo(Media otherMedia) {
        if (otherMedia instanceof DigitalVideoDisc) {
            DigitalVideoDisc otherDVD = (DigitalVideoDisc) otherMedia;

            // Compare titles first
            int titleComparison = getTitle().compareTo(otherDVD.getTitle());

            // If titles are equal, compare lengths in descending order
            if (titleComparison == 0) {
                int lengthComparison = Integer.compare(otherDVD.getLength(), getLength());

                // If lengths are equal, compare costs
                return (lengthComparison == 0) ? Float.compare(getCost(), otherDVD.getCost()) : lengthComparison;
            }

            return titleComparison;
        } else {
            // For non-DVD Media objects, use the default comparison (title then cost)
            return super.compareTo(otherMedia);
        }
    }


}
