package LeetcodeNotes.BSTLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Level order Queue, ArrayList
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){this.val = x;}
}
/*
102. Binary Tree Level Order Traversal
 */
public class BSTLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode curt = queue.poll();
                level.add(curt.val);
                if (curt.left != null){
                    queue.offer(curt.left);
                }
                if (curt.right != null) {
                    queue.offer(curt.right);
                }
            }
            result.add(level);
        }
        return result;
    }
    /*
199. Binary Tree Right Side View
 */
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curt = queue.poll();
                //only add mostrightnode
                if (i == size - 1) {
                    result.add(curt.val);
                }
                if (curt.left != null) {
                    queue.offer(curt.left);
                }
                if (curt.right != null) {
                    queue.offer(curt.right);
                }
            }
        }
        return result;
    }
}
