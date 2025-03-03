package L_03_03_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentFactory {
   private static Random rand = new Random();
   private static List<String> names = List.of("Дима","Иван","Дмитрий","Олег");



    public static Student next(){
        String name = names.get(rand.nextInt(names.size()));
        double grade = rand.nextDouble(20);
        return new Student(name,grade);
    }
}
