import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            displayMenu();
            choice = readInteger("Enter your choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    System.out.println("\nThank you for using Student Grade Tracker!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("        STUDENT GRADE TRACKER");
        System.out.println("========================================");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Exit");
        System.out.println("========================================");
    }

    static void addStudent() {

        System.out.println("\n--- Add Student ---");

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine().trim();

        if (id.isEmpty()) {
            System.out.println("Student ID cannot be empty.");
            return;
        }

        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }

        Student student = new Student(id, name);

        int numberOfSubjects;

        do {
            numberOfSubjects =
                    readInteger("Enter number of subjects: ");

            if (numberOfSubjects <= 0) {
                System.out.println("Number of subjects must be greater than 0.");
            }

        } while (numberOfSubjects <= 0);

        for (int i = 1; i <= numberOfSubjects; i++) {

            int grade;

            do {
                grade = readInteger(
                        "Enter grade for Subject " + i + " (0-100): "
                );

                if (grade < 0 || grade > 100) {
                    System.out.println(
                            "Invalid grade. Enter a value between 0 and 100."
                    );
                }

            } while (grade < 0 || grade > 100);

            student.addGrade(grade);
        }

        students.add(student);

        System.out.println("\nStudent added successfully!");
    }

    static void viewAllStudents() {

        if (students.isEmpty()) {
            System.out.println("\nNo students available.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("          STUDENT SUMMARY REPORT");
        System.out.println("========================================");

        for (Student student : students) {
            student.displayReport();
        }
    }

    static void searchStudent() {

        if (students.isEmpty()) {
            System.out.println("\nNo students available.");
            return;
        }

        System.out.print("\nEnter Student ID to search: ");
        String id = scanner.nextLine().trim();

        for (Student student : students) {

            if (student.getStudentId().equalsIgnoreCase(id)) {
                System.out.println("\nStudent Found!");
                student.displayReport();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static int readInteger(String message) {

        while (true) {

            System.out.print(message);

            try {
                return Integer.parseInt(scanner.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}