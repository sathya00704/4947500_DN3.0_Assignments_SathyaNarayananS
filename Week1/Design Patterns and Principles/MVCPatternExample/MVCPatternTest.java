public class MVCPatternTest {

    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("John Doe", 123456, "A");

        // Create a view to display student details
        StudentView studentView = new StudentView();

        // Create a controller to manage the student model and view
        StudentController controller = new StudentController(student, studentView);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentId(987654);
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}
