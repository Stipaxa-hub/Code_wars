package org.example.MaximumTripletSum;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static int maxTriSum(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .distinct()
                .limit(3)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
