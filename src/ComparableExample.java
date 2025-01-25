import java.util.*;

class Student1 implements Comparable<Student1> { // Changed to Comparable<Student1>
    private String name;
    private int grade;

    public Student1(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student1 other) { // Corrected parameter type to Student1
        return Integer.compare(this.grade, other.grade); // Natural order by grade
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Alice", 85));
        students.add(new Student1("Bob", 90));
        students.add(new Student1("Charlie", 80));

        Collections.sort(students); // Sort using natural order defined in compareTo

        for (Student1 student : students) {
            System.out.println(student);
        }
        // Expected output:
        // Charlie: 80
        // Alice: 85
        // Bob: 90
        // Using a lambda expression for custom sorting by grade in descending order
        Collections.sort(students, (s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()));
        System.out.println("Sorted by grade (desc): " + students);

        // Output
        // Bob: 90
        // Alice: 85
        // Charlie: 80
    }

}
