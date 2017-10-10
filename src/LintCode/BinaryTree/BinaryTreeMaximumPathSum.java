package LintCode.BinaryTree;
/*leetCode 124
1. root to leaf
2. root to any
3. any to any
*/
/**
 * Created by yanglu on 10/9/17.
 */
//class TreeNode{
//    int val;
//    TreeNode left, right;
//    public TreeNode(int val){
//        this.val = val;
//        this.left = this.right = null;
//    }
//}
class ResultType{
    int root2any;
    int any2any;
    public ResultType(int root2any, int any2any){
        this.root2any = root2any;
        this.any2any = any2any;
    }
}
//any2any
public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        ResultType result = help(root);
        return result.any2any;
    }
    private ResultType help(TreeNode root) {
        if (root == null) {
            return new ResultType(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        //divide
        ResultType left = help(root.left);
        ResultType right = help(root.right);

        int root2any = Math.max(0, Math.max(left.root2any, right.root2any));
        int any2any = Math.max(left.any2any, right.any2any);
        any2any = Math.max(any2any, Math.max(0, left.root2any)
                + Math.max(0, right.root2any) + root.val);
        return new ResultType(root2any, any2any);
    }
}

//root2any
/*
public class BinaryTreeMaximumPathSumII {
    public int maxPathSum2(TreeNode root){
        //base
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int left = maxPathSum2(root.left);
        int right = maxPathSum2(root.right);

        //root2any
        //1. root->left
        //2. root->right
        //3. root
        return Math.max(0,Math.max(left, right)) + root.val;

        //root2leaf
        return Math.max(left, right) + root.val
    }
}
*/