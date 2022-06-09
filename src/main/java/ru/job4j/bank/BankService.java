package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

/**
 * Класс представляет ряд банковских сервисов:
 * добавления клиента, создание счета клиента, поиск клиента
 * по реквизитам и перевод денег с одного счета клиента на другой
 */

public class BankService {

    /**
     * Коллекция с данными клиентов и их аккаунтов
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить данные о новом клиенте в коллекцию
     * если такого клиента там еще нет
     * @param user данные о новом пользователе
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет создать(добавить) счет для клиента.
     * Метод проверяет, есть ли клиент с указанными данными паспорта
     * в коллекции. Если такой клиент существует в коллекции, то происходит
     * проверка добавляемого счета с существующими счетами данного клиента.
     * И если такого счета нет, то данному клиенту открывается(добавляется)
     * новый счет.
     * @param passport значения поля паспорта клиента
     * @param account значение нового счета клиента
     */

    public void addAccount(String passport, Account account) {
        User client = findByPassport(passport);
        if (client != null) {
            List<Account> accountList = users.get(client);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск в коллекции клиента по значению
     * поля passport. Если находит совпадение, то возвращает
     * ссылку на клиента, если не находит - возвращает null
     * @param passport данные паспорта клиента
     * @return возвращает ссылку на клиента с указанными данными
     * паспорта если находит совпадение, и null, если не находит
     */

    public User findByPassport(String passport) {
        for (User client : users.keySet()) {
            if (client.getPassport().equals(passport)) {
                return client;
            }
        }
        return null;
    }

    /**
     * Метод повторяет функционал метода findByPassport,
     * но в стиле Stream API
     */

    public Optional<User> findByPassportStreamStyle(String passport) {
        return users.keySet().stream()
                .filter(c -> c.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет осуществлять поиск среди клиентов по полю
     * паспорт наличие счета с соответствующим значением поля реквизит.
     * И в случае совпадения возвращает ссылку на соответствующий счет,
     * в противном случае возвращает null
     * @param passport значение поля паспорта клиента
     * @param requisite значение поля идентификатора счета клиента
     * @return возвращает ссылку на счет клиента с соответствующим
     * идентификатором в случае совпадения, иначе возвращает null
     */

    public Account findByRequisite(String passport, String requisite) {
        User client = findByPassport(passport);
        if (client != null) {
            List<Account> accountList = users.get(client);
            for (Account list : accountList) {
                if (requisite.equals(list.getRequisite())) {
                    return list;
                }
            }
        }
        return null;
    }

    /**
     * Метод повторяет функционал метода findByRequisite,
     * но в стиле Stream API
     */

    public Optional<Account> findByRequisiteInStreamStyle(String passport, String requisite) {
        Optional<User> client = findByPassportStreamStyle(passport);
        return client.flatMap(user -> users.get(user).stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод позволяет осуществлять перевод денег с одного счета клиента
     * на другой счет клиента. Метод проверяет, что оба счета существуют, а также
     * что переводимая сумма не больше баланса счета с которого осуществляется
     * передача. В случае успеха возвращает true, а в случае неудачи - false
     * @param srcPassport данные поля паспорта клиента со счета которого выполняется перевод
     * @param srcRequisite данные поля идентификатора счета с которого выполняется перевод
     * @param destPassport данные поля паспорта клиента на счет которого выполняется перевод
     * @param destRequisite данные поля идентификатора счета на который выполняется перевод
     * @param amount сумма перевода
     * @return метод возвращает true в случае успеха и false в случае неудачи
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account destination = findByRequisite(destPassport, destRequisite);
        if (source != null && destination != null && source.getBalance() >= amount) {
            source.setBalance(source.getBalance() - amount);
            destination.setBalance(destination.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        User user = new User("FN3434Y", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        System.out.println(bank.findByPassportStreamStyle("FN3434Y"));
        System.out.println(bank.findByRequisiteInStreamStyle("FN3434Y", "5546"));
    }
}