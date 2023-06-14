package 二叉树;

/*Author:shyjiang233
 *  Desc:226
 */public class invertTree {
     public TreeNode invertTree(TreeNode root) {

         if(root==null){
             return  null;
         }
         invertTree(root.left);
         invertTree(root.right);
         swapRoot(root);
         return  root;
}

    private void swapRoot(TreeNode root) {
         TreeNode tmp=root.left;
         root.left=root.right;
         root.right=tmp;
    }
}
