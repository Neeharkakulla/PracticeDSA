package src.main;

import java.util.HashSet;
import java.util.Set;
/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class Solution_1 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		if (s.length() == 1)
			return 1;
		Set<Character> subString = null;
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			subString = new HashSet<>();
			subString.add(s.charAt(i));
			for (int j = i + 1; j < s.length(); j++) {
				if (subString.contains(s.charAt(j)))
					break;
				subString.add(s.charAt(j));
			}
			maxLength = Math.max(maxLength, subString.size());
		}
		return maxLength;
	}
}

public class LongestNonRepeatingSubstring {
	public static void main(String[] args) {
		Solution_1 sol=new Solution_1();
		System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
	}
}
