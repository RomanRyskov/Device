package Shop;

import java.util.List;
import java.util.Random;

public class CustomerFactory {
    private static List<String> names = List.of("Дмитрий", "Валерий", "Роман", "Владимир", "Станислав");
    private static List<String> lastNames = List.of("Иванов", "Смирнов", "Соловьев", "Петров", "Столяров");
    private static List<String> addresses = List.of("г.Витебск, ул.Смоленская 4", "г.Сморгонь, ул.Ленина 22", "г.Минск, ул.Строителей 24", "г.Могилев, ул. Герцина 11");
    private static Random rand = new Random();

    public static Customer next() {
        String name = names.get(rand.nextInt(names.size()));
        String lastName = lastNames.get(rand.nextInt(lastNames.size()));
        String address = addresses.get(rand.nextInt(addresses.size()));
        long phone = rand.nextLong(1000000, 9999999);
        String email = phone + "@gmail.com";
        return new Customer(name,lastName, address, phone, email);
    }


}
