package org.example.GreatestCommonDivisor;

public class GCD {
    public static int compute(int x, int y) {
        //your code here
        int res = 1;
        do {
            res = x % y;
            x = y;
            y = res;
        } while(res != 0);
        return x;
    }
}
