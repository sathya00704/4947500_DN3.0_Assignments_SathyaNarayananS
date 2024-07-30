class TaskLinkedList {
    private Node head;
    
    // Constructor to initialize an empty linked list
    public TaskLinkedList() {
        this.head = null;
    }
    
    // Method to add a task at the end of the linked list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    // Method to search for a task by taskId
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }
    
    // Method to traverse and display all tasks in the linked list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println("Task ID: " + current.task.taskId +
                               ", Task Name: " + current.task.taskName +
                               ", Status: " + current.task.status);
            current = current.next;
        }
    }
    
    // Method to delete a task by taskId
    public void deleteTask(int taskId) {
        if (head == null) {
            return; // List is empty
        }
        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.task.taskId == taskId) {
                current.next = current.next.next; // Bypass the node to be deleted
                return;
            }
            current = current.next;
        }
    }
}
