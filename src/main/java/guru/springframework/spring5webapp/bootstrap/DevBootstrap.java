package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    AuthorRepository authorRepository;
    BookRepository bookRepository;
    PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Alisha the publisher
        Publisher alisha = new Publisher("Alisha Lohan","Chandigarh","Hryana");
        publisherRepository.save(alisha);

        //Abhishek
        Author abhi = new Author("Abhishek","Bagde");
        Book aaa =  new Book("How to waste time playing CS","1234",alisha);

        abhi.getBooks().add(aaa);
        aaa.getAuthors().add(abhi);

        authorRepository.save(abhi);
        bookRepository.save(aaa);

        //Chirag
        Author chirag = new Author("Chirag","Mali");
        Book ccc =  new Book("How to spend money unwisely","4321",alisha);
        chirag.getBooks().add(ccc);
        ccc.getAuthors().add(chirag);

        authorRepository.save(chirag);
        bookRepository.save(ccc);

    }


}
