package Array;

import java.util.*;
/* for your understanding
 * all numbers are sorted in the array except two numbers
 * 
 * case 1: 
 * i/p :1 2 3 9 8 7 here 7 & 9 are unsorted
 * o/p: 1 2 3 7 8 9 so by swapping 7 & 9 we can make array sorted.
 * 
 * case2:
 * i/p: 4 2 3 0 here 0 & 4 are unsorted
 * o/p: 0 2 3 4 so by swapping 0 & 4 we can make array sorted.
 */
public class SwapUnsortedTwoNumbersInArray {
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int arr[]=new int[in.nextInt()];
    int first_index=0;
    int second_index=1;
    System.out.println("Enter "+arr.length+" positive elements into array");
    for(int i=0;i<arr.length;i++)
    	arr[i]=in.nextInt();
    
    for(int i=0;i<arr.length;i++)
    {
    	
      if(arr[first_index]<arr[second_index])
        first_index=i;
      else
    	  second_index=i;
     
    }
    
    	arr[first_index]+=arr[second_index];
    	arr[second_index]=arr[first_index]-arr[second_index];
    	arr[first_index]-=arr[second_index];
    
    
    System.out.print(Arrays.toString(arr));
    in.close();
  }
}