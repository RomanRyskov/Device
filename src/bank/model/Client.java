package bank.model;

import L10_04_2025.Student;

import java.util.List;
import java.util.Objects;

public class Client {
    private String id;
    private String name;
    private String secondName;
    private String email;
    private String phone;
    private String city;
    private String address;
    private List<Account> account;

    public Client(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
    }

    public static class Builder {
        private String id;
        private String name;
        private String email;
        private String phone;
        private String city;

        public Builder(String name, String id) {
            this.id = id;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }

    public List<Account> getAccount() {
        return account;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
