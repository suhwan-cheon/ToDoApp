package todolist.todolist;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import todolist.todolist.Service.TaskService;
import todolist.todolist.domain.Task;
import todolist.todolist.domain.TaskStatus;
import todolist.todolist.repository.TaskRepository;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TaskTest {

    @Autowired TaskRepository taskRepository;
    @Autowired TaskService taskService;

    @Test
    public void 테스크_등록() throws Exception {
        //given
        Task task = new Task();
        task.setContent("코딩 테스트");
        task.setStatus(TaskStatus.PROCEED);
        task.setDateTime("11월 6일 오후 3시");

        //when
        Long saveId = taskService.saveTask(task);

        //then
        Assertions.assertThat(task).isEqualTo(taskRepository.findOne(saveId));
    }

    @Test
    public void 테스크_완료() throws Exception {
        //given
        Task task = new Task();
        task.setContent("코딩 테스트");
        task.setStatus(TaskStatus.PROCEED);
        task.setDateTime("11월 6일 오후 3시");

        //when
        taskService.taskComplete(task);

        //then
        Assertions.assertThat(task.getStatus()).isEqualTo(TaskStatus.COMPLETE);
    }
}
