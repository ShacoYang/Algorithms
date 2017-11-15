package LeetcodeNotes.Linked_list;
/*
Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = head;
        while (dummy.next != null) {
            if (dummy.val == dummy.next.val){
                dummy.next = dummy.next.next;
            } else {
                dummy.next = dummy;
            }
        }
        return head;
    }
}
