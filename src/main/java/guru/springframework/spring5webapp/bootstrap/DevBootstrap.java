package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Abhishek
        Author abhi = new Author("Abhishek","Bagde");
        Book aaa =  new Book("How to waste time playing CS","1234","Alisha Lohan");
        abhi.getBooks().add(aaa);
        aaa.getAuthors().add(abhi);

        authorRepository.save(abhi);
        bookRepository.save(aaa);

        //Chirag
        Author chirag = new Author("Chirag","Mali");
        Book ccc =  new Book("How to spend money unwisely","4321","Alisha Lohan");
        chirag.getBooks().add(ccc);
        ccc.getAuthors().add(chirag);

        authorRepository.save(chirag);
        bookRepository.save(ccc);

    }


}
