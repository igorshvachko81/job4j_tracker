package ru.job4j.stream.grading;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(subject -> subject.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0.0d);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(t -> new Tuple(t.getName(), t.getSubjects()
                .stream()
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0.0d)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                        .entrySet().stream()
                .map(list -> new Tuple(list.getKey(), list.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(s -> new Tuple(s.getName(), s.getSubjects().stream()
                .mapToInt(Subject::getScore)
                .sum()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(list -> new Tuple(list.getKey(), list.getValue()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }
}