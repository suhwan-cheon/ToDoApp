package todolist.todolist.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import todolist.todolist.domain.Task;
import todolist.todolist.domain.TaskStatus;
import todolist.todolist.repository.TaskRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TaskService {

    //생성자가 하나이므로 @Autowired를 생략하였고, @RequiedArgsConstructor 를 이용해 생성자를 생략하여 final로 만들 수 있다.
    private final TaskRepository taskRepository;

    @Transactional
    public Long saveTask(Task task) {
        taskRepository.save(task);
        return task.getId();
    }

    public Task findOne(Long id) {
        return taskRepository.findOne(id);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void taskComplete(Task task) {
        task.setStatus(TaskStatus.COMPLETE);
    }
}
