package wl.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import wl.springframework.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
