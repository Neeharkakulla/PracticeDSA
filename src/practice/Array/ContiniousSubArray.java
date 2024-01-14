package practice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ContiniousSubArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter then size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements into array");
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		int s=0,e=0;
		
		
      
        int min = arr[n - 1];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[n - 1 - i]);
            if (arr[i] < max) {
                e = i;
            }
            if (arr[n - 1 - i] > min) {
                s = n - 1 - i;
            }
        }
       		
		System.out.println("Continious sub carry to be sorted is :");
		for(int i=s;i<=e;i++)
			System.out.print(arr[i]+" ");

	}

}
