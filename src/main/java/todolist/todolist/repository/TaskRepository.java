package todolist.todolist.repository;

import org.springframework.stereotype.Repository;
import todolist.todolist.domain.Task;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TaskRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Task task){
        em.persist(task);
    }

    public Task findOne(Long id) {
        return em.find(Task.class, id);
    }

    public List<Task> findAll() {
        return em.createQuery("select t from Task t", Task.class)
                .getResultList();
    }
}
