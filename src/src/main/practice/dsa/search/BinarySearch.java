package src.main.practice.dsa.search;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 2, 5, 7, 9, 22, 11, 33, 15 };
		int target = 9;
		int index = -1;
		Arrays.sort(arr);

		int low = 0, high = arr.length - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == target) {
				index = mid;
				break;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		if (index != -1)
			System.out.println("Element '" + target + "' found at index :: " + index);
		else
			System.out.println("Element '" + target + "' not found.");
	}
}
