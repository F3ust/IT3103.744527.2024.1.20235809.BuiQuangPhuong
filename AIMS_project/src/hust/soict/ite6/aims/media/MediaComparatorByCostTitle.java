package hust.soict.ite6.aims.media;

import java.util.Comparator;
//Bui Quang Phuong 20235809
public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costComparison = Float.compare(m2.getCost(), m1.getCost());
        if (costComparison != 0) {
            return costComparison;
        }
        return m1.getTitle().compareTo(m2.getTitle());
    }
}