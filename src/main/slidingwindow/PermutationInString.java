package main.slidingwindow;

public class PermutationInString {

	public static void main(String[] args) {
		String s1 = "ab", s2 = "eidbaooo";
		System.out.println(checkInclusion(s1, s2));

	}

	public static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return false;
		}

		int[] s1Count = new int[26];
		int[] s2Count = new int[26];

		// Build initial frequency counts
		for (int i = 0; i < s1.length(); i++) {
			s1Count[s1.charAt(i) - 'a']++;
			s2Count[s2.charAt(i) - 'a']++;
		}

		int matches = 0;
		for (int i = 0; i < 26; i++) {
			if (s1Count[i] == s2Count[i]) {
				matches++;
			}
		}

		int l = 0;
		for (int r = s1.length(); r < s2.length(); r++) {

			if (matches == 26) {
				return true;
			}

			// Add right character
			int index = s2.charAt(r) - 'a';
			s2Count[index]++;
			if (s1Count[index] == s2Count[index]) {
				matches++;
			} else if (s1Count[index] + 1 == s2Count[index]) {
				matches--;
			}

			// Remove left character
			index = s2.charAt(l) - 'a';
			s2Count[index]--;
			if (s1Count[index] == s2Count[index]) {
				matches++;
			} else if (s1Count[index] - 1 == s2Count[index]) {
				matches--;
			}

			l++;
		}

		return matches == 26;
	}

}
