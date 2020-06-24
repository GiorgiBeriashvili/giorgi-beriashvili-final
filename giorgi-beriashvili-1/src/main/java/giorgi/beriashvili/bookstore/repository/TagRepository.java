package giorgi.beriashvili.bookstore.repository;

import giorgi.beriashvili.bookstore.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
