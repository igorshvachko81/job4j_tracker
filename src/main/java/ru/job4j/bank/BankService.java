package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User client = findByPassport(passport);
        List<Account> accountList = users.get(client);
        if (!accountList.contains(account)) {
            accountList.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User client : users.keySet()) {
            if (client.getPassport().equals(passport)) {
                return client;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User client = findByPassport(passport);
        if (!(client == null)) {
            List<Account> accountList = users.get(client);
            for (Account list : accountList) {
                if (requisite.equals(list.getRequisite())) {
                    return list;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account destination = findByRequisite(destPassport, destRequisite);
        if (!(source == null) && !(destination == null)) {
            if (source.getBalance() >= amount) {
                source.setBalance(source.getBalance() - amount);
                destination.setBalance(destination.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }
}