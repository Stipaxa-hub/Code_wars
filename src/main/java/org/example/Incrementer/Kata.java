package org.example.Incrementer;

public class Kata {
    public static int[] incrementer(int[] numbers) {
        int[] res = new int[numbers.length];
        int incrementer = 1;
        for (int i = 0; i < numbers.length; i++) {
            res[i] = ((numbers[i] + incrementer) < 10) ? numbers[i] + incrementer : (numbers[i] + incrementer) % 10;
            ++incrementer;
        }
        return res; // replace with your code ..
    }
}
