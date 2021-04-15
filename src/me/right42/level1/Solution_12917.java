package me.right42.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_12917 {

    public String solution(String s) {
        String[] strs = s.split("");
        Arrays.sort(strs, Comparator.reverseOrder());

        return String.join("", strs);
    }

    public static void main(String[] args) {
        Solution_12917 s = new Solution_12917();
        System.out.println(s.solution("Zbcdefg"));
    }
}
