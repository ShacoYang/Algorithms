package LintCode.BinaryTree;

import java.util.ArrayList;

/**
 * Created by yanglu on 4/4/17.
 */
public class RecrusionPostorder {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traversae(root, result);
        return result;
    }
    private void traversae(TreeNode root, ArrayList<Integer> result){
        if (root == null) {
            return;
        }
        traversae(root.left, result);
        traversae(root.right, result);
        result.add(root.val);
    }
}
