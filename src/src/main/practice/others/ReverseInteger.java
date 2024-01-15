package src.main.practice.others;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(Solution_7.reverse(-120));
	}
}

class Solution_7 {
	public static int reverse(int x) {
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
			if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
				return 0;
		}
		return (int) (res);
	}
}