package hust.soict.ite6.aims.media;

public class DigitalVideoDisc {
    private String tile;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTile() {
        return tile;
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

    public DigitalVideoDisc(String tile, String category, String director, int length, float cost) {
        this.tile = tile;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tile, float cost) {
        this.tile = tile;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tile, String category, float cost) {
        this.tile = tile;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String tile, String category, String director, float cost) {
        this.tile = tile;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
}
