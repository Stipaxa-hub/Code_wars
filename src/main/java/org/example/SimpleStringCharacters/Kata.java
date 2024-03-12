package org.example.SimpleStringCharacters;

public class Kata {
    public static int[] Solve(String word) {
        //enjoy coding
        char[] letters = word.toCharArray();
        int[] res = new int[4];
        int upperCount = 0;
        int lowerCount = 0;
        int specialCount = 0;
        int digitCount = 0;

        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                upperCount++;
                continue;
            }
            if (Character.isLowerCase(letter)) {
                lowerCount++;
                continue;
            }
            if (Character.isDigit(letter)) {
                digitCount++;
                continue;
            }
            specialCount++;
        }
        res[0] = upperCount;
        res[1] = lowerCount;
        res[2] = digitCount;
        res[3] = specialCount;
        return res;

    }
}
