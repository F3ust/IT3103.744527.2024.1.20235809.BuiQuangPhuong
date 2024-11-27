package hust.soict.ite6.aims.media;

// Bui Quang Phuong 20235809

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    private static int nbDigitalVideoDisc = 0;

    public DigitalVideoDisc() {

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void setNbDigitalVideoDisc (int nbDigitalVideoDisc) {
        DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
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
        super(title, category, cost);
        this.director = director;
    }

}
