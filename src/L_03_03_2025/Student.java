package L_03_03_2025;

public class Student {
    private String name;
    private double grade;
    private int age;

    Student(String name, double grade,int age) {
        this.grade = grade;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Студент: " + name + ", возраст:" + age + ", имеет средний балл: " + grade;
    }

}
