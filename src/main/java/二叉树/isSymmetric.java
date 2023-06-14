package 二叉树;

/*Author:shyjiang233
 *  Desc:101
 */public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
       return compareRoot(root.left,root.right);
    }

    private Boolean compareRoot(TreeNode left, TreeNode right) {
    if(left!=null&&right==null){
        return  false;
    }
        if(left==null&&right!=null){
            return  false;
        }
        if(left==null&&right!=null){
            return  false;
        }
        if(left==null&&right==null){
            return  true;
        }
        if(left.val!=right.val){
            return  false;
        }
        Boolean outside=compareRoot(left.left,right.right);
        Boolean inside=compareRoot(left.right,right.left);
        return  outside&&inside;
    }
}
