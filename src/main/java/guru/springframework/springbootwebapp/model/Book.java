package guru.springframework.springbootwebapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;

    @ManyToMany
    @JoinTable(name="author_book", joinColumns = @JoinColumn(name="book_id"),
    inverseJoinColumns = @JoinColumn(name="author_id"))
    private Set<Author> authors;

}
