package guru.springframework.springbootwebapp.repositories;

import guru.springframework.springbootwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
