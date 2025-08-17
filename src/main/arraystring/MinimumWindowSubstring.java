package main.arraystring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	public static void main(String[] args) {
		String s = "ADOBECODEBANC", t = "ABC";
		System.out.println(minWindow(s, t));

	}

	private static String minWindow(String s, String t) {
		if (s.length() < t.length()) {
			return "";
		}

		Map<Character, Integer> tFreq = new HashMap<>();
		for (char c : t.toCharArray()) {
			tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
		}
		Map<Character, Integer> windowFreq = new HashMap<>();
		int have = 0, need = tFreq.size();
		int left = 0, minLen = Integer.MAX_VALUE;
		int start = 0;

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

			if (tFreq.containsKey(c) && windowFreq.get(c).intValue() == tFreq.get(c).intValue()) {
				have++;
			}

			while (have == need && left <= right) {
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					start = left;
				}

				char leftChar = s.charAt(left);
				windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
				if (tFreq.containsKey(leftChar) && windowFreq.get(leftChar) < tFreq.get(leftChar)) {
					have--;
				}

				left++;
			}
		}

		return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
	}

}
