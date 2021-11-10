package irfan.springexample.spring5webapp.bootstrap;

import irfan.springexample.spring5webapp.model.Author;
import irfan.springexample.spring5webapp.model.Book;
import irfan.springexample.spring5webapp.model.Publisher;
import irfan.springexample.spring5webapp.repository.AuthorRepository;
import irfan.springexample.spring5webapp.repository.BookRepository;
import irfan.springexample.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher arise = new Publisher("Arise COMPANY", "Engerthstrasse 231", "Vienna", "Austria", "1200");

        publisherRepository.save(arise);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(arise);
        arise.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(arise);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "323232323");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(arise);
        arise.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(arise);

        System.out.println("Starting bootstrap...");
        System.out.println(bookRepository.count());
        System.out.println(publisherRepository.count());
    }
}
