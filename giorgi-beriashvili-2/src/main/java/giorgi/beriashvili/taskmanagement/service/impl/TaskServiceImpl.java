package giorgi.beriashvili.taskmanagement.service.impl;

import giorgi.beriashvili.taskmanagement.dto.task.*;
import giorgi.beriashvili.taskmanagement.model.Task;
import giorgi.beriashvili.taskmanagement.repository.TaskRepository;
import giorgi.beriashvili.taskmanagement.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    final private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {
        List<TaskDTO> tasks = new ArrayList<>();

        for (Task task : taskRepository.findAll()) {
            tasks.add(TaskDTO.builder()
                    .title(task.getTitle())
                    .description(task.getDescription())
                    .startDate(task.getStartDate())
                    .endDate(task.getEndDate())
                    .build());
        }

        return GetTasksOutput.builder().tasks(tasks).build();
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        taskRepository.save(Task.builder()
                .title(addTaskInput.getTitle())
                .description(addTaskInput.getDescription())
                .startDate(addTaskInput.getStartDate())
                .endDate(addTaskInput.getEndDate())
                .build());

        return AddTaskOutput.builder().message("Task has been added successfully!").build();
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        taskRepository.deleteById(deleteTaskInput.getId());

        return DeleteTaskOutput.builder().message("Task has been deleted successfully!").build();
    }
}
