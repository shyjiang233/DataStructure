package 二叉树;

/*Author:shyjiang233
 *  Desc:104
 */public class maxDepth {
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return  Math.max(leftDepth,rightDepth)+1;
    }
}
