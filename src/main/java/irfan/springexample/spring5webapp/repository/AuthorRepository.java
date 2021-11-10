package irfan.springexample.spring5webapp.repository;

import irfan.springexample.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
