package LeetcodeNotes.Linked_list;
/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.
For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,
return 1->4->3->2->5->NULL.
 */
public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m > n) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        for (int i = 1; i < m; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        ListNode prevMnode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode postNnode = mNode.next;
        for (int i = m; i < n; i++) {
            if (postNnode == null) {
                return null;
            }
            ListNode temp = postNnode.next;
            postNnode.next = nNode;
            nNode = postNnode;
            postNnode = temp;
        }
        prevMnode.next = nNode;
        mNode.next = postNnode;
        return dummy.next;
    }
}
