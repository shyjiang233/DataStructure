package 链表;

public class reservseList {
    public static void main(String[] args) {
        ListNode Node4=new ListNode(1,null);
        ListNode Node3=new ListNode(2,Node4);
        ListNode Node2=new ListNode(3,Node3);
        ListNode Node1=new ListNode(14,Node2);

        ListNode node=new ListNode(1,Node1);
         ListNode v=reverseList(node) ;
        System.out.println(v);
    }
    public  static  ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private static ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode temp = null;
        temp = cur.next;// 先保存下一个节点
        cur.next = prev;// 反转
        // 更新prev、cur位置
        // prev = cur;
        // cur = temp;
        return reverse(cur, temp);
    }
}
