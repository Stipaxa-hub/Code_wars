package org.example.FilterTheNumber;

public class Kata {
    public static long filterString(final String value) {
        char[] chars = value.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (Character ch : chars) {
            if (Character.isDigit(ch)) {
                builder.append(ch);
            }
        }
        return Long.parseLong(builder.toString());
    }
}
