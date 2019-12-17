package guru.springframework.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;


    private Set<Book> authors =  new HashSet<>();

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName, Set<Book> authors) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.authors = authors;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }





}
