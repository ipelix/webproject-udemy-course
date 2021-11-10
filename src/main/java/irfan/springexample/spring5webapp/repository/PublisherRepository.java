package irfan.springexample.spring5webapp.repository;

import irfan.springexample.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
