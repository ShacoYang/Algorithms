# Algorithms
Lintcode and Leetcode  
* [Linked List](https://github.com/ShacoYang/Algorithms/tree/master/src/LeetcodeNotes/Linked_list)    
    * [AddTwoNumbers](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/AddTwoNumbers.java)
    ```
    dummy node,
    int carry = 0;
    carry = sum / 10;
    new ListNode(sum % 10)
    ```
    * [148 Sort List](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/Sort_List.java)
         ```java
         n log n --> merge sort -> left right -> mid
        ```
        * [21 MergeTwoSorted List](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/MergeTwoSortedList.java)
    * [206 Reversed Linked list I]
        ```java
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
        ```
        * [92 Reversed Linked list II](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/ReverseLinkedListII92.java)
        ```java
        ListNode prevMnode = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode postNnode = mNode.next;
        ```
    * [83 RemoveDuplicatesfromSortedList](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/RemoveDuplicatesfromSortedList83.java)
        ```java
           if (dummy.val == dummy.next.val){
               dummy.next = dummy.next.next;
           } else {
               dummy.next = dummy;
           }
        ```
        * [82 RemoveDuplicatesfromSortedList](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/RemoveDuplicatesfromSortedList82.java)
            ```java
            int dupVal = curt.val;
            ```
    * [203 Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/description/)
        ```java
        if (head.next.val == val) {
            head.next = head.next.next;
        }else{
            head = head.next;
        }
        ```
* [Tree]  
* [BFS]
* [DFS]
