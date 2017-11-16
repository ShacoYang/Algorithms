package LeetcodeNotes.Linked_list;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists){
        if (lists == null || lists.length == 0) {
            return null;
        }
        return patition(lists, 0, lists.length - 1);
    }
    public ListNode patition(ListNode[] lists, int start, int end) {
        if (start == end){
            return lists[start];
        } else if(start < end) {
            int mid = start + (end - start) / 2;
            ListNode left = patition(lists, start, mid);
            ListNode right = patition(lists, mid + 1, end);
            return merge(left, right);
        } else {
            return null;
        }

    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null){
            tail.next = list1;
        }else {
            tail.next = list2;
        }
    return dummy.next;
    }
}
