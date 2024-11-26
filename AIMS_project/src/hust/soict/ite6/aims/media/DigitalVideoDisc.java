package hust.soict.ite6.aims.media;

// Bui Quang Phuong 20235809

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public static void setNbDigitalVideoDisc (int nbDigitalVideoDisc) {
        DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        ++nbDigitalVideoDisc;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, float cost) {
        this.title = title;
        this.cost = cost;
        ++nbDigitalVideoDisc;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        ++nbDigitalVideoDisc;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        ++nbDigitalVideoDisc;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        ++nbDigitalVideoDisc;
        this.id = nbDigitalVideoDisc;
    }
    public String toString(){
        return String.format("DVD - %s - %s - %s -%d : %.2f $",title,category,director,length,cost);
    }
}
