package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Bui Quang Phuong 20235809

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost,List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
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
