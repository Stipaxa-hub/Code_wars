package org.example.SumofOddCubedNumbers;

import java.util.Arrays;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {

        //Good luck!
        return (int) Arrays.stream(arr)
                .filter(number -> number % 2 != 0)
                .mapToDouble(num -> Math.pow(num, 3))
                .sum();
    }
}
