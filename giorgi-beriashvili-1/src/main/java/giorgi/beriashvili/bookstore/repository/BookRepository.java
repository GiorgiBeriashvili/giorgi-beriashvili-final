package giorgi.beriashvili.bookstore.repository;

import giorgi.beriashvili.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
