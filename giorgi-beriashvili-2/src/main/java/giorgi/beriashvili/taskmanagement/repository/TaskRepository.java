package giorgi.beriashvili.taskmanagement.repository;

import giorgi.beriashvili.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
