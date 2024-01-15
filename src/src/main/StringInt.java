package src.main;

public class StringInt {
	public static void main(String[] args) {
		System.out.println(Solution_8.myAtoi("20000000000000000000"));
	}
}

class Solution_8 {
	public static int myAtoi(String s) {
		if (s == null)
			return 0;
		s = s.trim();
		if (s.isEmpty())
			return 0;
		boolean neg = s.charAt(0) == '-';
		boolean pos = s.charAt(0) == '+';
		int end = -1;
		for (int i = (neg || pos) ? 1 : 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				end = i;
			else
				break;
		}
		try {
			return (end != -1) ? Integer.parseInt(s.substring(0, end + 1)) : 0;
		} catch (NumberFormatException e) {
			return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}
	}
}
