package LeetcodeNotes.Linked_list;
/*Reverse a singly linked list.*/
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curt = head;
        while (curt != null) {
            ListNode temp = curt.next;
            curt.next = pre;
            pre = curt;
            curt = temp;
        }
        return pre;
    }
}
