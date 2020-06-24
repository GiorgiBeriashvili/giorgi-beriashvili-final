package giorgi.beriashvili.taskmanagement.service;

import giorgi.beriashvili.taskmanagement.dto.task.*;

public interface TaskService {
    GetTasksOutput getTasks(GetTasksInput getTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}
