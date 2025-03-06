package L_03_03_2025;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final List<Student> ls = new ArrayList<>(100);
        final List<Student> ls2 = new ArrayList<>(100);

        for (int i = 0; i <= 100; i++) {
            ls.add(StudentFactory.next());
            ls2.add(StudentFactory.next());
        }
        System.out.println(ls);
        foundName(ls, "Вадим");
        removeName(ls, "Дмитрий");
        System.out.println("\nПосле удаления все Дим\n");
        System.out.println(ls);
        System.out.println(ls.size());
        addList(ls, ls2);
        System.out.println(ls.size());
        Student Vasilii = new Student("Ярополк", 16.44232, 22);
        changeIndex(ls, 0);
        System.out.println(ls);
        sortArray(ls);
        System.out.println(ls);

        sortByComparator(ls2, new StudentNameComparator());
        System.out.println(ls2);
    }

    private static Student foundName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    private static void removeName(List<Student> students, String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    private static void addList(List<Student> students, List<Student> list) {
        students.addAll(list);
    }

    private static void changeIndex(List<Student> students, int index) {
        if (students.size()<index || index < 0) {
            return;
        }
        students.set(index, new Student("Ярополк", 16.44232, 22));
    }
    private static void sortArray(List<Student>students){
        Collections.sort(students);
    }
   private static void sortByComparator(List<Student>students, Comparator<Student>comparator){
        students.sort(comparator);
    }
}








