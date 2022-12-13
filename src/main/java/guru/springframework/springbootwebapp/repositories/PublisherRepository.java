package guru.springframework.springbootwebapp.repositories;

import guru.springframework.springbootwebapp.model.Book;
import guru.springframework.springbootwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
