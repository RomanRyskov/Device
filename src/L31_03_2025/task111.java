package L31_03_2025;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class task111 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("one.txt");
            System.out.println("Файл найден");
        } catch (FileNotFoundException e) {
           System.out.println(e);

        }
    }
}
