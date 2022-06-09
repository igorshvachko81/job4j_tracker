package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> student = Optional.empty();
        for (Student s : students.keySet()) {
            if (account.equals(s.getAccount())) {
                student = Optional.of(s);
                break;
            }
        }
        return student;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> subject = Optional.empty();
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            Set<Subject> subjects = students.get(student.get());
            for (Subject s : subjects) {
                if (name.equals(s.getName())) {
                    subject = Optional.of(s);
                    break;
                }
            }
        }
        return subject;
    }
}