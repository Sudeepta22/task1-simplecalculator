import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    private ArrayList<Double> grades;

    public StudentGradeTracker() {
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return grades.size() > 0 ? total / grades.size() : 0;
    }

    public String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayGrades() {
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades.get(i));
        }
    }

    public static void main(String[] args) {
        StudentGradeTracker tracker = new StudentGradeTracker();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            tracker.addGrade(grade);

            System.out.print("Do you want to add another grade? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        double average = tracker.calculateAverage();
        String letterGrade = tracker.getLetterGrade(average);

        System.out.println("\n--- Grades Entered ---");
        tracker.displayGrades();

        System.out.println("\nAverage Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        
        scanner.close();
    }
}
