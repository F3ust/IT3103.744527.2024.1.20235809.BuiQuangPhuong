package hust.soict.ite6.aims.media.disc.compactDisc;
// Bui Quang Phuong 20235809
public class Track {
    private String title;
    private float length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public Track(String title, float length) {
        this.title = title;
        this.length = length;
    }

    public Track() {

    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
