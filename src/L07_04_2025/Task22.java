package L07_04_2025;

import java.io.*;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("files/file.txt");) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("files/file.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }
        File file = new File("files/file.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new FileWriter("files/file2.txt")) {
            fileWriter.write("Привет, я новая строка");

        } catch (IOException e) {
            System.out.println("Неудалось записать в файл");
        }
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("files/file2.txt"))) {
            writer.write("Строка");
            writer.newLine();
            writer.write("Строка");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }
        try (PrintWriter writer = new PrintWriter("files/file.txt")) {
            writer.println("С новой строки");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }
    }
}
