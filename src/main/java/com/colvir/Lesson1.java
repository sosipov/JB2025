package com.colvir;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Разработать программу на Java с использованием Stream API, которая
 * принимает на вход некоторый текст (например, из консоли или внешнего
 * файла), вычисляет частоту появления слов в этом тексте и после чего
 * выводит эти слова, отсортированными в убывающем порядке их частотности
 * появления в тексте.
 * Под словом подразумевается любая непрерывная последовательность
 * символов (до пробела, точки, запятой, двоеточия и других разделителей),
 * состоящая только из букв и цифр, не учитывая регистр букв.
 * Например, в строке "Семь раз отмерь, 1 раз отрежь!" ровно 5 слов: "семь",
 * "раз", "отмерь", "1", "отрежь".
 * Результат должен быть такой:
 * раз
 * семь
 * отмерь
 * 1
 * отрежь
 */
public class Lesson1 {

    public static void main(String[] args) {
        String s = "Семь раз отмерь, 1 раз отрежь!";

        Arrays.stream(s.split("[^a-zA-zА-Яа-я0-9]+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().sorted((o1, o2) -> Long.compare(o2.getValue(), o1.getValue()))
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
