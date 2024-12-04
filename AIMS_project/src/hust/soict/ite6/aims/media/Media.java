package hust.soict.ite6.aims.media;

// Bui Quang Phuong 20235809

import java.util.Comparator;

public abstract class  Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void setNbMedia (int nbMedia) {
        Media.nbMedia= nbMedia;
    }

    public Media() {

    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        ++nbMedia;
        this.id = nbMedia;
    }

    public Media(String title) {
        this.title = title;
        ++nbMedia;
        this.id = nbMedia;
    }

    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
        ++nbMedia;
        this.id = nbMedia;
    }

    @Override
    public String toString() {
        return "Media - " + getId()+" - "+ getTitle() + " - " + getCategory()  + ": " + getCost() + " $";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Media media = (Media) obj;
        return title.equals(media.title);
    }
    //Bui Quang Phuong 20235809
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new Comparator<Media>() {
        @Override
        public int compare(Media media1, Media media2) {
            int titleComparison = media1.getTitle().compareTo(media2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;
            }
            return Float.compare(media1.getCost(), media2.getCost());
        }
    };

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new Comparator<Media>() {
        @Override
        public int compare(Media media1, Media media2) {
            int costComparison = Float.compare(media1.getCost(), media2.getCost());
            if (costComparison != 0) {
                return costComparison;
            }
            return media1.getTitle().compareTo(media2.getTitle());
        }
    };
    @Override
    public int compareTo(Media otherMedia) {
        // Compare titles first
        int titleComparison = this.title.compareTo(otherMedia.getTitle());

        // If titles are equal, compare costs
        return (titleComparison == 0) ? Float.compare(this.cost, otherMedia.getCost()) : titleComparison;
    }
}
