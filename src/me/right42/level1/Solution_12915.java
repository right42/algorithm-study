package me.right42.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_12915 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (first, second) -> {
            int compare = first.charAt(n) - second.charAt(n);
            if(compare == 0) {
                return first.compareTo(second);
            }
            return compare;
        });

        return strings;
    }
}
