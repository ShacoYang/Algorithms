package LeetcodeNotes.Linked_list;
/*Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
You must do this in-place without altering the nodes' values.*/

// split into two parts, reverse the righthalf then combine them
public class ReorderList143 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = findMid(head);
        ListNode tail = reverse(mid.next);
        mid.next = null;
        merge(head, tail);
    }
    public void merge(ListNode head, ListNode head2) {
        int index = 0;
        ListNode dummy = new ListNode(0);
        while (head != null && head2 != null) {
            if (index % 2 == 0) {
                dummy.next = head;
                head = head.next;
            } else {
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
            index++;
        }
        if (head != null) {
            dummy.next = head;
        }
        if (head2 != null) {
            dummy.next = head2;
        }
    }
    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

}
