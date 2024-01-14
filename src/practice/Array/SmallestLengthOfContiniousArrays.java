package Array;

import java.util.Arrays;
import java.util.Scanner;
//(1<<j) is a number with jth bit 1 
// so when we 'and' them with the 
// subset number we get which numbers 
// are present in the subset and which 
// are not 
public class SmallestLengthOfContiniousArrays {
	public static void minSubArray(int []arr,int sum,int n)
	{
		if(n==0||sum==0) {
			System.out.println(0);
			return;
		}
		int result=Integer.MAX_VALUE;
		 for (int i = 0; i < (1<<n); i++) 
	        { 
	             
	            for (int j = 0,subsum=0,subcount=0; j < n; j++) {
	            	
	                if ((i & (1 << j)) > 0) {
	                	//System.out.println(Integer.toBinaryString(i)+" "+Integer.toBinaryString((1<<j)));
	                	subsum+=arr[j];
	                	subcount++;
	                	if(subsum==sum)
	                	{
	                		
	                		result=Math.min(result, subcount);
	                		break;
	                	}
	                }	
	            }
	        }
		 if(result==Integer.MAX_VALUE)
			 System.out.println(0);
		 else
		 System.out.println(result);
		 }
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter ther size of an array");
	int n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter "+n+" positive elements into array");
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
	System.out.println("Enter the sum to calculate minmum length sub array");
	int sum=in.nextInt();
	Arrays.sort(arr);
	minSubArray(arr,sum,n);
	
}
}
