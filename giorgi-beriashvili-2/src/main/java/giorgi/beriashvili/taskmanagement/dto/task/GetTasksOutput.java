package giorgi.beriashvili.taskmanagement.dto.task;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetTasksOutput {
    private List<TaskDTO> tasks;
}
