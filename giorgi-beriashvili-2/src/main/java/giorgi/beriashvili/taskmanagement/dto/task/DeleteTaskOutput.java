package giorgi.beriashvili.taskmanagement.dto.task;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DeleteTaskOutput {
    private String message;
}
