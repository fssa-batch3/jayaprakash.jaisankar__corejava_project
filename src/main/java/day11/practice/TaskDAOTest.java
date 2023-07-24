package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskDAOTest {

    @Test
    void testCreateTask() {
        TaskDAO dao = new TaskDAO();
        Task task = new Task();
        task.id = 1;
        task.name = "Task Test";
        task.status = "InProgress";

        try {
            dao.createTask(task);
        } catch (DAOException e) {
            e.printStackTrace();
            Assertions.fail("Exception occurred while creating the task: " + e.getMessage());
        }
    }
}
