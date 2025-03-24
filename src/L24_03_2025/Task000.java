package L24_03_2025;

import java.util.EnumMap;
import java.util.EnumSet;

public class Task000 {
    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        test(friday);
        System.out.println(friday.getRussianName());
        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY);
        new EnumMap<DayOfWeek, Integer>(DayOfWeek.class);
    }
     private  static void  test(DayOfWeek dayOfWeek){
        if(DayOfWeek.FRIDAY == dayOfWeek){
            System.out.println("Ура пятница");
        }
     }

}
