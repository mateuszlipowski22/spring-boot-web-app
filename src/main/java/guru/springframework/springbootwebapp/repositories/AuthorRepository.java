package guru.springframework.springbootwebapp.repositories;

import guru.springframework.springbootwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
