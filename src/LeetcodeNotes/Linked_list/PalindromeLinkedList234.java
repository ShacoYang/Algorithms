package LeetcodeNotes.Linked_list;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }
        ListNode mid = findMid(head);
        mid.next = reverse(mid.next);
        ListNode p1 = head;
        ListNode p2 = mid.next;
        while (p1 != null && p2 != null && p1.val == p2.val){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2 == null;
    }
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curt = head;
        while (curt != null) {
            ListNode temp = curt.next;
            curt.next = prev;
            prev = curt;
            curt = temp;
        }
        return prev;
    }
}
