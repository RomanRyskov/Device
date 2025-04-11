package calculator;

import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Calculate_manager manager = new Calculate_manager();
        try {
            BufferedReader br = new BufferedReader(new FileReader("files/input.txt"));
            String text;
            while ((text = br.readLine()) != null) {
                String[] s = text.split(" ");
                double a = manager.parseDouble(s[0]);
                double b = manager.parseDouble(s[2]);
                String operation = s[1];
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/output.txt"))) {
                    String s1 = String.valueOf(manager.calculation(a, b, operation));
                    bw.write(s1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}