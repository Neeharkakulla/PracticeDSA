package src.main.practice.others;

public class LargestPalindrome {
	public static void main(String[] args) {
		System.out.println(" res :: " + Solution_6.longestPalindrome("aacabdkacaa"));
	}
}

class Solution_6 {
	public static String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";
		int len = s.length();
		if (len <= 1)
			return s;
		int start = 0, end = 0;
		for (int i = 0; i < len; i++) {

			int len1 = expandArondCenter(s, i, i);
			int len2 = expandArondCenter(s, i, i + 1);

			int maxLen = Math.max(len1, len2);
			if (maxLen > end - start) {
				start = i - (maxLen - 1) / 2;
				end = i + maxLen / 2;
			}

		}
		return s.substring(start, end + 1);
	}

	private static int expandArondCenter(String s, int i, int j) {

		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return j - i - 1;
	}
}
