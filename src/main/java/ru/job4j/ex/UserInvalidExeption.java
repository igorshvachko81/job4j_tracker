package ru.job4j.ex;

public class UserInvalidExeption extends UserNotFoundExeption {
    public UserInvalidExeption(String message) {
        super(message);
    }
}
