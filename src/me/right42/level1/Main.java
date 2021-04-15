package me.right42.level1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> result = new ArrayList<>();

        int lastValue = -1;
        for (int value : arr) {
            if (value != lastValue) {
                result.add(value);
                lastValue = value;
            }
        }

        return result;
    }
}
