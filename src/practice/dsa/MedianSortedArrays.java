package practice.dsa;

public class MedianSortedArrays {
	public static void main(String[] args) {

		System.out.println(Solution_5.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 3 }));
	}
}

//2,3,4,5,6,7
//1,8

//1,2,3,4,5,6,7,8

//n1=2,n2=6
//index=0
// m1=3,m2=4
//if length%2==0 then
// if index<n1 then  
//    num2

class Solution_5 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		int m1 = 0, m2 = 0;
		for (int i = 0, j = 0, count = 0; count <= (n1 + n2) / 2; count++) {
			m2 = m1;
			if (i != n1 && j != n2) {
				if (nums1[i] > nums2[j])
					m1 = nums2[j++];
				else
					m1 = nums1[i++];
			} else if (i < n1) {
				m1 = nums1[i++];
			} else {
				m1 = nums2[j++];
			}
		}
		if ((n1 + n2) % 2 == 0) {
			return (double) (m1 + m2) / 2.0;
		} else {
			return m1;

		}
	}

}
