package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*二叉树的层序遍历*/
public class levelOrder {

       List<List<Integer>> list=new ArrayList<>();

        public List<List<Integer>> levelOrder(TreeNode node){
           checkFun(node);
           return  list;
        }
        public  void checkFun(TreeNode node){
            if(node==null){
                return;
            }
            Queue<TreeNode> que=new LinkedList<TreeNode>();
            que.offer(node);
            while (!que.isEmpty()){
                List<Integer> integerList=new ArrayList<>();
                int len=que.size();
                while (len>0){
                    TreeNode tmpnode=que.poll();
                    integerList.add(tmpnode.val);
                    if (tmpnode.left!=null){
                        que.add(tmpnode.left);
                    }
                    if (tmpnode.right!=null){
                        que.add(tmpnode.right);
                    }
                    len--;
                }
                list.add(integerList);
            }
        }



}
