package Lottotron.Model;

import java.util.Objects;

public  class Participant {
    private int PassportId;
    private String name;
    private int age;
    private String gender;


    public Participant(int passportId, String name, int age, String gender) {
        PassportId = passportId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getPassportId() {
        return PassportId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return PassportId == that.PassportId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(PassportId);
    }

    @Override
    public String toString() {
        return "Участник: " + PassportId + ", " + name + ", " + age + ", " + gender;
    }
}
