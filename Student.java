import java.util.ArrayList;

public class Student {
    private String studentId;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public int getHighestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        int highest = grades.get(0);

        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    public int getLowestGrade() {
        if (grades.isEmpty()) {
            return 0;
        }

        int lowest = grades.get(0);

        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }

    public String getPerformance() {
        double average = calculateAverage();

        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Very Good";
        } else if (average >= 60) {
            return "Good";
        } else if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void displayReport() {
        System.out.println("\n----------------------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + name);
        System.out.println("Grades       : " + grades);
        System.out.printf("Average      : %.2f%n", calculateAverage());
        System.out.println("Highest      : " + getHighestGrade());
        System.out.println("Lowest       : " + getLowestGrade());
        System.out.println("Performance  : " + getPerformance());
        System.out.println("----------------------------------------");
    }
}