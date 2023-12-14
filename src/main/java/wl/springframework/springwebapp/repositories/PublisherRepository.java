package wl.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import wl.springframework.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
