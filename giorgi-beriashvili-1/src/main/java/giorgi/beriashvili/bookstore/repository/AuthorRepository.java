package giorgi.beriashvili.bookstore.repository;

import giorgi.beriashvili.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
