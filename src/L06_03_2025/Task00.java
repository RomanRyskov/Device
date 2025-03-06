package L06_03_2025;

import L_03_03_2025.Student;
import L_03_03_2025.StudentFactory;

import java.util.HashSet;
import java.util.Set;

public class Task000 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        for (int i = 0;i<10;i++){
            Student next = StudentFactory.next();
            students.add(StudentFactory.next());
            students.add(next);
        }

        System.out.println(students);
        System.out.println(students.size());
    }
}
