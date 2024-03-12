package org.example.OddEvenStringSort;

public class OddEvenSort {
    public static String sortMyString(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i += 2) {
            builder.append(chars[i]);
        }
        builder.append(" ");
        for (int i = 1; i < chars.length; i+= 2) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
