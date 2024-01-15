package src.main.practice.dsa.search;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[]=new int[] {1,4,2,5,7,9,22,11,33,15};
		int target=9;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
			}
		}
		if(index!=-1)
			System.out.println("Element '"+target+"' found at index :: "+index);
		else
			System.out.println("Element '"+target +"' not found.");
	}
}
