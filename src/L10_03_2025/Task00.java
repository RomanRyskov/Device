package L10_03_2025;

import L_03_03_2025.Student;
import L_03_03_2025.StudentFactory;
import Transport.Main;

import java.util.HashMap;
import java.util.Map;

public class Task00 {
    public static void main(String[] args) {
        Student student = new Student("Dima", 22, 7);
        Student student2 = new Student("Petya", 25, 8);
        Student student3 = new Student("Katya", 25, 8);
        Map<Integer, Student> mapGradeToStudent = new HashMap<>();
        mapGradeToStudent.put(student.getAge(), student);
        mapGradeToStudent.put(student2.getAge(), student2);
        mapGradeToStudent.put(student3.getAge(), student3);
        for(Map.Entry<Integer,Student> entry: mapGradeToStudent.entrySet()){
            Student value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
