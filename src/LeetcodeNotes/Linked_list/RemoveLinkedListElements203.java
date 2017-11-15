package LeetcodeNotes.Linked_list;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next != null) {
            if (head.val == val) {
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return dummy.next;
    }
}
