package todolist.todolist.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Task {

    @Id @GeneratedValue
    @Column(name = "task_id")
    private Long id;

    // 내용
    private String content;

    // 날짜
    private String dateTime;

    // 상태
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

}
