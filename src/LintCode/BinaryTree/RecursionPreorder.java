package LintCode.BinaryTree;

import java.util.ArrayList;

/**
 * Created by yanglu on 4/4/17.
 */
class TreeNode{
    public int val;
    public TreeNode left, right;
    public TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
public class RecursionPreorder {
    public ArrayList<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    public void traverse(TreeNode root, ArrayList<Integer> result){
        if (root == null) {
            return;
        }
        //root left right
        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
