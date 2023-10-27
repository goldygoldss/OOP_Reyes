package studentsinformation;
import java.util.Scanner;
public class StudentsInformation {
    
    private static final int MAX_STUDENTS = 10;
    private Student[] studentList = new Student[MAX_STUDENTS];
    private int studentCount = 0;
    
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
        StudentsInformation s = new StudentsInformation();

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. View Student");
            System.out.println("4. Exit");
            System.out.print("Select Choices: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                s.addStudent(scanner);
            } else if (choice == 2) {
                s.editStudent(scanner);
            } else if (choice == 3) {
                s.viewStudents();
            } else if (choice == 4) {                
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent(Scanner scanner) {
        if (studentCount < MAX_STUDENTS) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student course: ");
            String course = scanner.next();
            System.out.print("Enter student GWA: ");
            double grade = scanner.nextDouble();

            Student student = new Student(name, course, grade);
            studentList[studentCount] = student;
            studentCount++;

            System.out.println("Student added successfully.");
        } else {
            System.out.println("The Students Information list is full. Cannot add more student.");
        }
    }

    private void editStudent(Scanner scanner) {
        viewStudents();
        System.out.print("Enter of the student to edit: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < studentCount) {
            System.out.print("Enter new student name: ");
            String name = scanner.next();
            System.out.print("Enter new student course: ");
            String course = scanner.next();
            System.out.print("Enter new student GWA: ");
            double grade = scanner.nextDouble();

            Student student = studentList[index];
            student.setName(name);
            student.setCourse(course);
            student.setGrade(grade);

            System.out.println("Student edited successfully.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    private void viewStudents() {
        System.out.println("Student List:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(i + ". " + studentList[i]);
        }
    }
}

    

