package giorgi.beriashvili.taskmanagement.dto.task;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class TaskDTO {
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
}
