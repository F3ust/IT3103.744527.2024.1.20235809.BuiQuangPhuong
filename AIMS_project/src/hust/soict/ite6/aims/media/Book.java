package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Bui Quang Phuong 20235809

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book(int id, List<String> authors, float cost, String category, String title) {
        this.id = id;
        this.authors = authors;
        this.cost = cost;
        this.category = category;
        this.title = title;
    }
    public Book() {

    }
    public void addAuthor(String author) {
        for (String i : authors) {
            if (Objects.equals(i, author)) {
                System.out.println("Author already existed");
                return;
            }
        }
        authors.add(author);
        System.out.println("Author added successfully");
    }
    // Bui Quang Phuong 20235809
    public void removeAuthor(String author) {
        for (int i = 0; i < authors.size(); ++i) {
            if (Objects.equals(authors.get(i), author)) {
                authors.remove(i);
                System.out.println("Author removed successfully");
                return;
            }
        }
        System.out.println("Author not exist");
    }

}
