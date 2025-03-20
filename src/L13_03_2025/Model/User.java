package L13_03_2025.Model;

import L13_03_2025.Factory.TransportFactory;
import L13_03_2025.Services.TransportService;

import java.util.*;

public class User {
    private String name;
    private int age;
    private int countCar;
    private List<Transport> trans;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.countCar = 0;
        this.trans = new ArrayList<>();
        assignRandomTransport();
    }

    private void assignRandomTransport() {
        Random rand = new Random();
        int tCount = rand.nextInt(10);
        for (int i = 0; i < tCount; i++) {
            Transport transport = TransportFactory.next();
            if (transport != null) {
                transport.setUser(this); // Присваиваем текущего пользователя транспорту
            }
            trans.add(transport);
            TransportService.transports.add(transport);
        }
        countCar =trans.size();
    }

    public int getCountCar() {
        return countCar;
    }

    @Override
    public String toString() {
        return ", Пользователь: " + name + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
