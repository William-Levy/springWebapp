package wl.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import wl.springframework.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
