package L_03_03_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentFactory {
   private static final Random rand = new Random();
   private static final List<String> names = List.of("Вадим","Иван","Дмитрий","Олег");



    public static Student next(){
        String name = names.get(rand.nextInt(names.size()));
        double grade = rand.nextDouble(20);
        int age = rand.nextInt(17,25);
        return new Student(name,grade,age);
    }
}
