package hust.soict.ite6.aims.media;

import java.util.Comparator;
//Bui Quang Phuong 20235809
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Float.compare(media2.getCost(), media1.getCost());
    }
}