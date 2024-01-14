package practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PermutationsOfArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		System.out.println("Enter the "+n+" numbers to array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		List<List<Integer>> list=permutations(0,arr,n,new ArrayList<>());
		list.stream().forEach((List<Integer> l)->{System.out.println(l);});
	}

	private static List<List<Integer>> 
			permutations(int i, int[] arr, int n, List<List<Integer>> res) 
	{
		if(i==arr.length-1)
		{
			List<Integer> p=Arrays.stream(arr).boxed().collect(Collectors.toList());
			res.add(p);
		}
		else
		{
			for(int j=i;j<n;j++) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				permutations(i+1, arr, n, res);
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;	
			}
		}
		
		return res;
	}

	

}
