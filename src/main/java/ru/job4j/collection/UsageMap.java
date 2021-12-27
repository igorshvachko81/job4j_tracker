package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> note = new HashMap<>();
        note.put("vlad_dubovik@yandex.ru", "Vladislav Dubovik");
        note.put("kiril_mamontov@yandex.ru", "Kiril Mamontov");
        note.put("ivan_postoev@yandex.ru", "Ivan Postoev");
        for (String mail: note.keySet()) {
            String name = note.get(mail);
            System.out.println(mail + " = " + name);
        }
    }
}
