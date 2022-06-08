package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (var person: persons) {
            if (person.getName().contains(key)
                    || person.getSurname().contains(key)
                    || person.getPhone().contains(key)
                    || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> advFind(String key) {
        Predicate<Person> inName = (p) -> p.getName().contains(key);
        Predicate<Person> inSurname = (p) -> p.getSurname().contains(key);
        Predicate<Person> inPhone = (p) -> p.getPhone().contains(key);
        Predicate<Person> inAddress = (p) -> p.getAddress().contains(key);
        Predicate<Person> combine = inName.or(inSurname).or(inPhone).or(inAddress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
