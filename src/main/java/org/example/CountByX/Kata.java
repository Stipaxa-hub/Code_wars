package org.example.CountByX;

public class Kata {
    public static int[] countBy(int x, int n){
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = i * x;
        }
        return result;
    }
}
