package LeetcodeNotes.Linked_list;
/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */
public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null){
            return null;
        }
        ListNode dummyLeft = new ListNode(0);
        ListNode left = dummyLeft;
        ListNode dummyRight = new ListNode(0);
        ListNode right = dummyRight;
        while (head != null) {
            if (head.val < x){
                dummyLeft.next = head;
                //===============
                dummyLeft = head;
                //===============
            }else {
                dummyRight.next = head;
                dummyRight = head
            }
            head = head.next;
        }
        dummyRight.next = null;
        dummyLeft.next =right.next;
        return left.next;
    }
}
