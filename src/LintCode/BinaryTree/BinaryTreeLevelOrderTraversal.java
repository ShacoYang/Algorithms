package LintCode.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yanglu on 4/10/17.
 * http://www.lintcode.com/en/problem/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
        //1 not leveled
//        ArrayList<Integer>result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()){
//            TreeNode head = queue.poll();
//            //add current value
//            result.add(head.val);
//            if (head.left != null){
//                queue.offer(head.left);
//            }
//            if (head.right != null) {
//                queue.offer(head.right);
//            }
//        }
//        return result;
       // 2. leveled main point: queue.size() --> for
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        return result;

    }
}
