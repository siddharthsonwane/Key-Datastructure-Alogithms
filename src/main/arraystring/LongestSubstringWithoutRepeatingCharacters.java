package main.arraystring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(":" + lenghtOfLongestSubstring(s)); // Expected: [[-1, -1, 2], [-1, 0, 1]]

	}

	private static int lenghtOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0, maxLen = 0;

		for (int right = 0; right < s.length(); right++) {
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}

}
