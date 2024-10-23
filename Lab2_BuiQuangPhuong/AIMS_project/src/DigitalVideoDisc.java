public class DigitalVideoDisc {
    private String tile;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
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


}
