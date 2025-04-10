package L10_04_2025;

public class Task003 {
    public static void main(String[] args) {
        /*SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample);
        System.out.println(singletonExample2);*/
        Student student = new Student.Builder("Дима")
                .age(35)
                .email("fsdf@gmail.com")
                .build();

        StudentService studentService = new StudentServiceImpl();
        StudentService studentServiceLogging = new LoggingStudentServiceDecorator(studentService);
        studentServiceLogging.enroll("Дима");
        studentServiceLogging.printAll();

    }
}
