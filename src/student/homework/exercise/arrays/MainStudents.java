package student.homework.exercise.arrays;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Random;

public class MainStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> bestList = new ArrayList<>();
        int indexOfTheBest = 0;
        Faker faker = new Faker();
        Random random = new Random();
        // Generate 5 students
        for (int i=0; i < 5; i++) {
            students.add(new Student(faker.name().fullName(),
                    faker.educator().course(),
                    random.nextFloat(6, 10)));
        }
        System.out.println("List of Students:");
        students.forEach(System.out::println);
        // Find best Student
        for (int i=0; i < students.size(); i++) {
            if (students.get(i).grade > students.get(indexOfTheBest).grade) {
                indexOfTheBest = i;
            }
        }
        System.out.println("Index of the best student is " + indexOfTheBest);
        // Give 0.1 to grade of the best student
        System.out.println("Give 0.1 to grade for best student");
        students.get(indexOfTheBest).grade += 0.1f;
        System.out.println(students.get(indexOfTheBest));
        // best list
        System.out.println("Best student list:");
        for (Student student : students) {
            if (student.grade > 8f) {
                bestList.add(student);
            }
        }
        bestList.forEach(System.out::println);
    }
}

class Student {
    String fullName;
    String specialty;
    Float  grade;

    public Student () {}

    public Student(String fullName, String specialty, Float grade) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Student full name= %s, specialty= %s, grade= %.2f",
                fullName, specialty, grade);
    }
}
