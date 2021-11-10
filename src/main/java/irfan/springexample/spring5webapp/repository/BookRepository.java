package irfan.springexample.spring5webapp.repository;

import irfan.springexample.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
