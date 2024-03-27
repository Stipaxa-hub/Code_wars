package org.example.ProductOfMaximumsOfArrayArraySeries2;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static long maxProduct(int[] numbers, int sub_size)
    {
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(sub_size)
                .mapToLong(Long::valueOf)
                .reduce(Long.valueOf(1), (subtotal, number) -> subtotal * number);
         // Do your magic!
    }
}
