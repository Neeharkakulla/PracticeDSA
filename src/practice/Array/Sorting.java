package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		System.out.println("Enter the "+n+" numbers to array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		in.close();
	}

}
