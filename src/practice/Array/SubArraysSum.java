package Array;

import java.util.Scanner;

public class SubArraysSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=i+1;
		System.out.println("Enter min size of sub array");
		calculate(arr,in.nextInt());

	}

	private static void calculate(int[] arr, int k) {
		int sum=0,min=Integer.MAX_VALUE,last=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			
			if(i+1>=k)
			{
				if(min>sum)
				{
					
					min=sum;
					last=i;
				}
				sum-=arr[i+1-k];
			}
		}
		
		System.out.println(min+" "+(last-k+1)+" "+last);
	}

}
