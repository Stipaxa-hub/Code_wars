package org.example.DoesMyNumberLookBigInThis;

import java.util.Arrays;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        String[] digits = String.valueOf(number).split("");
        int sum = Arrays.stream( String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .map(digit -> (int) Math.pow(digit, digits.length))
                .sum();
        return sum == number;
    }
}
