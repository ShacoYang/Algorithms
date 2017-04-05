package LintCode.BinaryTree;

/**
 * Created by yanglu on 4/4/17.
 */
public class BinaryTreeMaxPathSumII {
    public int maxPathSum2(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left = maxPathSum2(root.left);
        int right = maxPathSum2(root.right);

        //Math.max(0) --> subtree has negative nums
        return Math.max(0,Math.max(left,right)) + root.val;
    }
}
