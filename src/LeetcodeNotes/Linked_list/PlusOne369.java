package LeetcodeNotes.Linked_list;

import java.util.Stack;

public class PlusOne369 {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Stack<ListNode> s = new Stack<>();

        while (head != null) {
            s.push(head);
            head = head.next;
        }
        int carry = 1;
        while (!s.isEmpty()) {
            ListNode node = s.pop();
            int digit = node.val + carry;
            node.val = digit % 10;
            carry = digit / 10;
        }
        return carry ==1 ? dummy : dummy.next;
    }
}
