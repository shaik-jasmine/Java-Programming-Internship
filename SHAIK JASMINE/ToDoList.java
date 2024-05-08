import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ToDoList!");
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter index of task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    removeTask(indexToRemove);
                    break;
                case 3:
                    System.out.print("Enter index of task to mark as completed: ");
                    int indexToMark = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    markAsCompleted(indexToMark);
                    break;
                case 4:
                    viewTasks();
                    break;
                case 5:
                    System.out.println("Exiting ToDoList. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }
    private static void removeTask(int index) {
        if (index > 0 && index <= tasks.size()) {
            tasks.remove(index-1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid index! No task removed.");
        }
    }
    private static void markAsCompleted(int index) {
        if (index > 0 && index <= tasks.size()) {
            String task = tasks.get(index-1);
            task += " (Completed)";
            tasks.set(index-1, task);
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid index! No task marked as completed.");
        }
    }
    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
