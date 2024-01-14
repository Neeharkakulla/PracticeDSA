package practice.dsa;

public class LargestPalindrome {
	public static void main(String[] args) {
		System.out.println(" res :: " + Solution_6.longestPalindrome("aacabdkacaa"));
	}
}

class Solution_6 {
	public static String longestPalindrome(String s) {
		int len = s.length();
		if (len <= 1)
			return s;
		String res = s.substring(0, 1);
		for (int i = 0; i < len; i++) {

			if (len - i > res.length()) {
				String subStr = s.substring(i, len);
				for (int k = 0; k < subStr.length(); k++) {

					String sub1 = subStr.substring(0, subStr.length() - k);

					boolean isPalindrome = false;
					if (subStr.length() > res.length()) {
						for (int j = 0; j < (sub1.length() / 2); j++) {
							if (sub1.charAt(j) != sub1.charAt(sub1.length() - j - 1)) {
								isPalindrome = false;
								break;
							}
							isPalindrome = true;
						}
					}
					if (isPalindrome)
						res = sub1.length() > res.length() ? sub1 : res;
				}
			}
		}
		return res;
	}
}
