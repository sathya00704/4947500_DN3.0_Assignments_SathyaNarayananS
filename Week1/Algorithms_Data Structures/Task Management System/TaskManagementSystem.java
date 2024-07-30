public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        
        // Adding tasks
        taskList.addTask(new Task(1, "Task 1", "Pending"));
        taskList.addTask(new Task(2, "Task 2", "Completed"));
        taskList.addTask(new Task(3, "Task 3", "In Progress"));
        
        // Displaying tasks
        System.out.println("Tasks in the list:");
        taskList.traverse();
        
        // Searching for a task
        int searchTaskId = 2;
        Task foundTask = taskList.searchTask(searchTaskId);
        if (foundTask != null) {
            System.out.println("\nTask found with ID " + searchTaskId + ": " + foundTask.taskName);
        } else {
            System.out.println("\nTask with ID " + searchTaskId + " not found.");
        }
        
        // Deleting a task
        int deleteTaskId = 1;
        taskList.deleteTask(deleteTaskId);
        System.out.println("\nTask with ID " + deleteTaskId + " deleted.");
        
        // Displaying tasks after deletion
        System.out.println("\nTasks in the list after deletion:");
        taskList.traverse();
    }
}