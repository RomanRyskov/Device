package L13_03_2025.Model;

import L13_03_2025.User;

import java.util.Objects;

public abstract class Transport {
    private User user;
    private String model;
    private int speed;
    private String licensePlate;
    private int year;


    public Transport(String model, int speed, String licensePlate, int year) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return " Номерной знак - "+ licensePlate+ ": Модель= " + model + ", Скорость=" + speed + ",";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }
}
