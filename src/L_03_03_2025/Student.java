package L_03_03_2025;

public class Student implements Comparable<Student> {
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
    public int compareTo(Student o) {
        int nameCompare = this.name.compareTo(o.name);
        if(nameCompare!=0){
            return  nameCompare;
        }
        return Integer.compare(this.age, o.age);
    }

}
