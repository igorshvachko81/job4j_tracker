package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель клиента банка
 * @author Igor Shvachko
 * @version 1.0
 */

public class User {
    /**
     * Данные паспорта (passport) и имя (username) клиента
     */
    private String passport;
    private String username;

    /**
     * Создание нового объекта класса конструктором
     * @param passport данные паспорта
     * @param username имя клиента
     */

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить данные поля паспорта клиента
     * @return возвращает данные поля паспорта клиента
     */

    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет изменить значение поля паспорта клиента
     * @param passport принимает новое значение паспорта клиента
     */

    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить данные поля имени клиента
     * @return возвращает данные поля имени клиента
     */

    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет изменить значение поля имени клиента
     * @param username принимает новое значение имени клиента
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод переопределяет equals, сравнивает текущего пользователя и
     * пользователя задаваемого в качестве аргумента метода.
     * Если класс объекта подаваемого в качестве аргумента метода совпадает
     * с классом пользователя, то проверяется поле passport этих аккаунтов.
     * Если поля равны - возвращает true, иначе возвращает false.
     * @param o получаемый для сравнения объект
     * @return возвращаемый результат сравнения принятого объекта с текущим
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод вычисляет хеш-значение поля requisite
     * @return возвращает хеш-значение поля requisite
     */

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}