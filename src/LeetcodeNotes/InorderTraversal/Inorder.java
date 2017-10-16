package LeetcodeNotes.InorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// inorder traversal, Kth Smallest Element in BST, isValidBST --> inorder
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        this.val = x;
    }
}

public class Inorder {
    /*
   1. 94 Binary Tree Inorder Traversal
    */
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        TreeNode curt = root;
        while (curt != null || !stack.isEmpty()) { //outer
            while(curt != null) { //left bot
                stack.push(curt);
                curt = curt.left;
            }
            curt = stack.pop();
            list.add(curt.val);
            curt = curt.right;
        }
        return list;
    }
     /*
    2. 230 Kth Smallest Element in a BST
     */
     public int kthSmallest(TreeNode root, int k) {
         Stack<TreeNode> stack = new Stack<>();
         TreeNode curt = root;
         if (root == null) {
             return -1;
         }
         while (curt != null || !stack.isEmpty()){
             while (curt != null) {
                 stack.push(curt);
                 curt = curt.left;
             }
             curt = stack.pop();
             k--;
             if (k ==0){
                 return curt.val;
             }
             curt = curt.right;
         }
         return -1;
     }
     /*
    3. 98. Validate Binary Search Tree
     */
     public boolean isValidBST(TreeNode root) {
         if (root == null) {
             return true;
         }
         Stack<TreeNode> stack = new Stack<>();
         TreeNode curt = root;
         TreeNode pre = null;
         while (curt != null || !stack.isEmpty()){
             while (curt != null) {
                 stack.push(curt);
                 curt = curt.left;
             }
             curt = stack.pop();
             //
             if (pre != null && pre.val >= curt.val) {
                 return true;
             }
             pre = curt;
             curt = curt.right;
         }
         return true;
     }
}
