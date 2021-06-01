package me.right42.level1;

public class Solution_12903 {

	public static void main(String[] args) {
		Solution_12903 solution = new Solution_12903();
		System.out.println(solution.solution("abcde"));
		System.out.println(solution.solution("qwer"));
	}

	public String solution(String s) {
		int beginIndex = 0;
		int endIndex = 0;
		int middleIndex = s.length() / 2;

		if(s.length() % 2 == 0) {
			beginIndex = middleIndex - 1;
		} else {
			beginIndex = middleIndex;
		}
		endIndex = middleIndex + 1;
		return s.substring(beginIndex, endIndex);
	}
}
