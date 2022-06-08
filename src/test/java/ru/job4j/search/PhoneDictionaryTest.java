package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Jonh", "Rembo", "82045078", "Smalltown")
        );
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Ivan", "Arsentev", "534873", "Bryansk")
        );
        System.out.println("Search keyword is: \"Ars\"");
        var persons = phones.find("Ars");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons.get(1).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNotFindCompare() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Jonh", "Rembo", "82045078", "Smalltown")
        );
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Ivan", "Arsentev", "534873", "Bryansk")
        );
        System.out.println("Search keyword is: \"Maestro\"");
        var persons = phones.find("Maestro");
        assertTrue(persons.isEmpty());
    }

    @Test
    public void whenFindByAdvancedFind() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Jonh", "Rembo", "82045078", "Smalltown")
        );
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Ivan", "Arsentev", "534873", "Bryansk")
        );
        System.out.println("Search keyword is: \"Ars\"");
        var persons = phones.advFind("Ars");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons.get(1).getSurname(), is("Arsentev"));
    }

}
