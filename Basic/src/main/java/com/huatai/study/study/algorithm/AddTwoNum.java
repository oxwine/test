package com.huatai.study.study.algorithm;

import java.util.LinkedList;

public class AddTwoNum {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);ll.add(3);ll.add(4);
		
		LinkedList<Integer> ll2= new LinkedList<Integer>();
		ll2.add(9);ll2.add(6);ll2.add(4);


	}
	public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> dummyHead = new LinkedList<Integer>();
	    LinkedList<Integer>  p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

//	作者：LeetCode
//	链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-xiang-jia-by-leetcode/
//	来源：力扣（LeetCode）
//	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
