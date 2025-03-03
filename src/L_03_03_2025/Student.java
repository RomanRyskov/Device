package L_03_03_2025;

public class Student {
    private String name;
    private double grade;

    Student(String name, double grade ){
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " имеет средний балл: "+ grade;
    }

}
