package 链表;

public class Test1 {
    public static void main(String[] args) {
        ListNode Node4=new ListNode(1,null);
        ListNode Node3=new ListNode(2,Node4);
        ListNode Node2=new ListNode(3,Node3);
        ListNode Node1=new ListNode(14,Node2);

        ListNode node=new ListNode(1,Node1);
        ListNode b=removeElements(node,1);
        System.out.println(b);
    }
    public  static  ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dummy=new ListNode(-1,head);
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        return dummy.next;


    }
}
