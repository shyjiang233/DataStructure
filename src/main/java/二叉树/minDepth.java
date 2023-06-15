package 二叉树;

/*Author:shyjiang233
 *  Desc:111
 */public class minDepth {
    public int minDepth(TreeNode root) {
        if(root==null){
         return 0;}
        int leftDeptj=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        if(root.left==null){
            return  rightDepth+1;
        }
        if(root.right==null){
            return  leftDeptj+1;
        }
        if(root.left==null){
            return  rightDepth+1;
        }
       return  Math.min(leftDeptj,rightDepth)+1;
    }

}
