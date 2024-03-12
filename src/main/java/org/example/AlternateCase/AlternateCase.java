package org.example.AlternateCase;

public class AlternateCase {
    static String alternateCase(final String string) {
        char[] chars = string.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (Character c : chars) {
           builder.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        return builder.toString();
    }
}
