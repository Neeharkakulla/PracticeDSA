 package src.main.practice.others;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result1 {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		int res = 0;
		
		for (int i = a.size() - 1; i <= b.get(0); i++) {
			
			int c = 0;
			
			for (int j : a) {
				
				if (j != 0 && i % j == 0) {
					
					c++;
				}
			}
			if (c == a.size()) {
				
				c = 0;
				for (int k : b) {
					
					if (i != 0 && k % i == 0) {
						c++;
					}
				}
				if (c == b.size())
					res++;
				
			}

		}

		//System.out.println("NM:" + nm + " N:" + n + " M:" + m);
		return res;

	}

}

public class Between2Sets {
	public static void main(String[] args) throws IOException {
		List<Integer> arr = new ArrayList<>();
		List<Integer> brr = new ArrayList<>();
		arr.add(2);
		arr.add(4);
		brr.add(16);
		brr.add(32);
		brr.add(96);
		int total = Result1.getTotalX(arr, brr);
		System.out.println(total);

	}
}
