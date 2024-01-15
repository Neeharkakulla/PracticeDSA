package src.main.practice.dsa.sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 2, 5, 7, 9, 22, 11, 33, 15 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("After Merge Sorting");
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			mergeResult(arr, left, mid, right);
		}
	}

	private static void mergeResult(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArr[i] = arr[left + i];
		}
		for (int i = 0; i < n2; i++) {
			rightArr[i] = arr[mid + i + 1];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
}
