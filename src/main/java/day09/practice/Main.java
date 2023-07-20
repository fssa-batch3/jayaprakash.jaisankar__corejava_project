package day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter tasks (id, name, deadline) or type 'exit' to stop:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                String[] taskStrings = input.split("\n");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                for (String taskStr : taskStrings) {
                    String[] taskData = taskStr.split(",");
                    int id = Integer.parseInt(taskData[0]);
                    String name = taskData[1];
                    LocalDate deadline = LocalDate.parse(taskData[2], formatter);

                    Task task = new Task(id, name, deadline);
                    tasks.add(task);
                }

                Collections.sort(tasks, Comparator.comparing(Task::getDeadline));

                System.out.println("Sample Output:");
                for (Task task : tasks) {
                    System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
                }
            }
        }
    }
}


      
      



