package rshv.samplespringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rshv.samplespringboot.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);
}
