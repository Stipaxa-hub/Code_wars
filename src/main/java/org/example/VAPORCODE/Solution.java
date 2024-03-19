package org.example.VAPORCODE;

public class Solution {
    public static String vaporcode(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char character : chars) {
            if (Character.isSpaceChar(character)) {
                continue;
            }
            builder.append(Character.toUpperCase(character)).append("  ");
        }
        return builder.toString().trim();
    }
}
