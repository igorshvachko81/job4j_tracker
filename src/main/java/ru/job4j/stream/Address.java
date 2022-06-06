package ru.job4j.stream;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(String city, String street, int house, int apartment) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;

    }

    public String getCity() {
        return city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, house, apartment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return house == address.house
                && apartment == address.apartment
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }
}
