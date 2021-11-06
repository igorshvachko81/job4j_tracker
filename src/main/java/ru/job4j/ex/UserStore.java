package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundExeption {
        User search = null;
        for (User member
                : users) {
            String ones = member.getUsername();
            if (Objects.equals(ones, login)) {
                search = member;
            }
        }
        if (Objects.equals(search, null)) {
            throw new UserNotFoundExeption("User was not found.");
        }
        return search;
    }

    public static boolean validate(User user) throws UserInvalidExeption {
        boolean valid = true;
        if (!user.isValid() || user.getUsername().length() < 3) {
            valid = false;
            throw new UserInvalidExeption("User " + user.getUsername() + " not valid.");
        }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Bruce Lee", false),
                new User("MC", true)
        };
        try {
            User user = findUser(users, "MC");
            if (validate(user)) {
                System.out.println("This user has an access.");
            }
        } catch (UserInvalidExeption ui) {
            System.out.println("User is not valid.");
        } catch (UserNotFoundExeption unf) {
            System.out.println("User not found.");
        }
    }
}
