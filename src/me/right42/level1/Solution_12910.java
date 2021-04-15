package me.right42.level1;

import java.util.Arrays;

public class Solution_12910 {

    public int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}
