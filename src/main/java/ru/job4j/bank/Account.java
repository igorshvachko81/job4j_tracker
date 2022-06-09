package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных банковского счёта
 * @author Igor Shvachko
 * @version 1.0
 */
public class Account {
    /**
     * Данные: идентификатор счёта(requisite)
     * и баланс счёта(balance)
     */
    private String requisite;
    private double balance;

    /**
     * Создание нового объекта класса конструктором
     * @param requisite задаёт идентификатор счета
     * @param balance задаёт кол-во денег на счете
     */

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить идентификатор счёта
     * @return возвращает идентификатор счёта
     */

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет изменить идентификатор счёта
     * @param requisite - задаёт новый идентификатор для счёта
     */

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс счёта
     * @return возвращает баланс на счёте
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет изменять баланс на счёте
     * @param balance - новое состояние баланса счёта
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод переопределяет equals, сравнивает текущий аккаунт с
     * аргументом метода. Если класс объекта задаваемого в качестве
     * аргумента метода совпадает с классом аккаунта, то проверяется
     * поле requisite этих аккаунтов. Если поля равны - возвращает true,
     * иначе возвращает false.
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод вычисляет хеш-значение поля requisite
     * @return возвращает хеш-значение поля requisite
     */

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    @Override
    public String toString() {
        return "Account: " + requisite + "/ Balance: " + balance;
    }
}