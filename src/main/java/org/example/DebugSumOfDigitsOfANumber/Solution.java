package org.example.DebugSumOfDigitsOfANumber;

public class Solution {
    public static int sumOfDigits(int n) {
        Integer sum = 0;
        String digits = n + "";
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(digits.charAt(i) + "");
        }
        return sum;
    }
}
