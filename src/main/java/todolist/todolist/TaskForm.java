package todolist.todolist;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter @Setter
public class TaskForm {

    @NotEmpty(message = "할 일을 입력해주세요!")
    private String content;

    @NotEmpty(message = "날짜를 입력해주세요!")
    private String dateTime;
}
