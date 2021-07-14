package todolist.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import todolist.todolist.Service.TaskService;
import todolist.todolist.TaskForm;
import todolist.todolist.domain.Task;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping(value = "/new")
    public String createTask(Model model) {
        model.addAttribute("taskForm", new TaskForm());
        return "createTask";
    }

    @PostMapping(value = "/new")
    public String create(@Valid TaskForm form, BindingResult result) {

        if(result.hasErrors()) {
            return "createTask";
        }

        Task task = new Task();
        task.setContent(form.getContent());
        task.setDateTime(form.getDateTime());

        taskService.saveTask(task);

        return "redirect:/";
    }

    @GetMapping(value = "/list")
    public String list(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "taskList";
    }
}
