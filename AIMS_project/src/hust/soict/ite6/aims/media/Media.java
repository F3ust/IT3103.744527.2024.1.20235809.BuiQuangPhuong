package hust.soict.ite6.aims.media;

// Bui Quang Phuong 20235809

public abstract class Media {
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

    public String toString() {
        return "Media - " + getId()+" - "+ getTitle() + " - " + getCategory()  + ": " + getCost() + " $";
    }
}
