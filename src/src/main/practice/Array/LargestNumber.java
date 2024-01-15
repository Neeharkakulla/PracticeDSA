package src.main.practice.Array;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	List<String> list=new LinkedList<>();
	System.out.println("Enter the size of array");
	int arr[]=new int[in.nextInt()];
	System.out.println("Enter "+arr.length+" positive Numbers");
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
		list.add(""+arr[i]);
	}
	list.stream()
		.sorted((String s1,String s2)-> (s2+s1).compareTo(s1+s2))
		.forEach(System.out::print);
	}
}
