package giorgi.beriashvili.bookstore.repository;

import giorgi.beriashvili.bookstore.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
