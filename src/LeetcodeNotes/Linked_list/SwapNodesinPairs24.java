package LeetcodeNotes.Linked_list;
//class ListNode{
//    int val;
//    ListNode next;
//    public ListNode(int x){val = x;}
//}
public class SwapNodesinPairs24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (dummy.next != null && dummy.next.next != null) {
            // head->n1->n2->...
            // => head->n2->n1->...
            ListNode l1 = dummy.next;
            ListNode l2 = dummy.next.next;
            l1.next = l2.next;
            l2.next = l1;
            //move to next pair
            head = l1;
        }
        return head.next;
    }
}
