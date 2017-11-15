package LeetcodeNotes.Linked_list;

import java.util.LinkedList;

//class ListNode {
//    int val;
//    ListNode next;
//    public ListNode(int x) {
//        val = x;
//    }
//}
/*Sort a linked list in O(n log n) time using constant space complexity.*/
//1. n log n --> merge sort -> left right -> mid
public class Sort_List {
    public ListNode sortList(ListNode head) {

        //base case
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMid(head);
        System.out.println("mid " + mid.val);
        //assign right first --> right.next == null left
        ListNode right = sortList(mid.next);
        System.out.println("right " + right.val);
        mid.next = null;
        ListNode left = sortList(head);
        System.out.println("left " + left.val);

        System.out.println("======================");
        System.out.println(left.val +"  "+right.val);
        System.out.println("=======================");
        return merge(left, right);
    }
    public ListNode findMid(ListNode head) {
        //slow fast
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(13);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(10);
        ListNode node6 = new ListNode(23);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


//        while (node1!= null) {
//            System.out.print(node1.val + "->");
//            node1 = node1.next;
//        }
//        System.out.println("null");


        Sort_List sort_list = new Sort_List();

        sort_list.sortList(node1);


    }
}
