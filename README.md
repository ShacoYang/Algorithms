# Algorithms
Lintcode and Leetcode  
* [Linked List](https://github.com/ShacoYang/Algorithms/tree/master/src/LeetcodeNotes/Linked_list)  
   **Reverse a linked list**: prev = null, curt = head   
   **Find the middle point:**  
   **Find the Nth element**: remove Nth from END   
   **Dummy node**: when structure could be changed (head modify or delete)   
    * [AddTwoNumbers](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/AddTwoNumbers.java)
        ```
        dummy node,
        int carry = 0;
        carry = sum / 10;
        new ListNode(sum % 10)
        ```
        * [369 Plus One](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/PlusOne369.java)
            ```java
             ListNode dummy = new ListNode(0);
             dummy.next = head;
             Stack<ListNode> s = new Stack<>();
            ```
    * [148 Sort List](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/Sort_List.java)
         ```java
         n log n --> merge sort -> left right -> mid
        ```
        * [21 MergeTwoSorted List](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/MergeTwoSortedList.java)
    * [206 Reversed Linked list I]
        * [92 Reversed Linked list II](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/ReverseLinkedListII92.java)
    
    * [83 RemoveDuplicatesfromSortedList](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/RemoveDuplicatesfromSortedList83.java)
        * [82 RemoveDuplicatesfromSortedList](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/RemoveDuplicatesfromSortedList82.java)
            ```java
            int dupVal = curt.val;
            ```
    * [203 Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/description/)
        ```java
        if (head.next.val == val)
        ```
    * [19 RemoveNthfromEnd](https://github.com/ShacoYang/Algorithms/blob/master/src/LeetcodeNotes/Linked_list/RemoveNthFromEnd19.java)
    
* [Tree]  
* [BFS]
* [DFS]
