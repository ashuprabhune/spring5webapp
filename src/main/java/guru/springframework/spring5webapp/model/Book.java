package guru.springframework.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

public class Book {
    private Long id;
    private String title;
    private String isbn;
    private String publisher;

    private Set<Author> authors =  new HashSet<>();

    public Book(Long id, String title, String isbn, String publisher) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(Long id, String title, String isbn, String publisher, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
