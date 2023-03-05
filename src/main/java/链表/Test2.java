package 链表;
/*    链表相加*/
public class Test2 {
    public static void main(String[] args) {
        ListNode Node4=new ListNode(1,null);
        ListNode Node3=new ListNode(2,Node4);
        ListNode Node2=new ListNode(3,Node3);
        ListNode Node1=new ListNode(14,Node2);

        ListNode node=new ListNode(1,Node1);



        ListNode  Node5=new ListNode(1,null);
        ListNode  Node6=new ListNode(2,Node5);
        ListNode Node7=new ListNode(5,Node6);
        ListNode Node8=new ListNode(77,Node7);
        ListNode v=getIntersectionNode(node,Node8);
        System.out.println(v);
    }
    public  static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA;
        ListNode pB=headB;
        while(pA!=pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;

        }
        return pA;
    }
}
