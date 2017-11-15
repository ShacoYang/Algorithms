package LeetcodeNotes.Linked_list;
/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 */
public class RemoveDuplicatesfromSortedList82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curt = head;
        while (curt != null && curt.next != null) {
            if (curt.val == curt.next.val) {
                int dupVal = curt.val;
                while (curt != null && curt.val == dupVal){
                    prev.next = curt.next;
                    curt = curt.next;
                }
            }else {
                prev = curt;
                curt = curt.next;
            }
        }
    return dummy.next;
    }
}
