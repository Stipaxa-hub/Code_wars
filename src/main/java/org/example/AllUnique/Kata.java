package org.example.AllUnique;

import java.util.stream.Collectors;

public class Kata {
    public static boolean hasUniqueChars(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet())
                .size() == str.length();
    }
}
