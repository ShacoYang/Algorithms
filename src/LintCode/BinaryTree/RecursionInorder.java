package LintCode.BinaryTree;

import java.util.ArrayList;

/**
 * Created by yanglu on 4/4/17.
 */
//class TreeNode{
//    public int val;
//    public TreeNode left, right;
//    public TreeNode(int val){
//        this.left = this.right = null;
//    }
//}
public class RecursionInorder {
    public ArrayList<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    public void traverse(TreeNode root, ArrayList<Integer> result){
        if (root == null) {
            return;
        }
        //left root right
        traverse(root.left, result);
        result.add(result.val);
        traverse(root.right, result);
    }
}

