package src.main.practice.others;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode head = result;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			if (carry > 0) {
				sum += carry;
				carry = 0;
			}
			if (sum >= 10) {
				carry = 1;
				sum = sum - 10;
			}

			result.next = new ListNode(sum);
			result = result.next;

		}
		if (carry > 0) {
			result.next = new ListNode(carry);
			result = result.next;
		}

		return head.next;
	}

}

public class Add2Numbers {
	public static void main(String[] args) {
		// l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]

	}
}