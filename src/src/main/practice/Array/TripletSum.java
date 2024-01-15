package src.main.practice.Array;
import java.util.Arrays;
import java.util.Scanner;
class Triplet
{
	int x1;
	int x2;
	int x3;
	
	@Override
	public String toString() {
		return "(" + x1 + "," + x2 + ","+ x3 + ")";
	}

	public void getAllTiplets(int[] arr,int sum) {
		Triplet t=new Triplet();
		
		for(int i=0;i<arr.length;i++)
		{
			int newSum=sum-arr[i];
			int low=i+1;
			int high=arr.length-1;
			while(low<high)
			{
				if(arr[low]+arr[high]<newSum)
					low++;
				else if(arr[low]+arr[high]>newSum)
					high--;
				else
				{
					
					t.x1=arr[i];
					t.x2=arr[low];
					t.x3=arr[high];
					
					low++;
					high--;
					System.out.println(t);
				}			
			}	
		}
		
	}
}
public class TripletSum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Triplet t=new Triplet();
		System.out.println("Enter the size of an array");
		int n=in.nextInt();
		System.out.println("Enter "+n+" elements to array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		System.out.println("Enter any sum");
		int sum=in.nextInt();
		Arrays.sort(arr);
		t.getAllTiplets(arr,sum);
		in.close();
	}

}
