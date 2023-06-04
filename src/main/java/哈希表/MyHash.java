package 哈希表;

/*Author:shyjiang233
 *  Desc:手写哈希表
 */public class MyHash<K,V> {
     private  static  final  int DEFAULT_CAPACITY=16;
     private Node<K,V>[] buckets;
     private int size;
     public MyHash(){
         buckets=new Node[DEFAULT_CAPACITY];
         size=0;
     }
         public  void put(K key,V value){
         int index=getIndex(key);
         Node<K,V> newNode=new Node<>(key,value);
         if(buckets[index]==null){
            buckets[index]=newNode;
             }else{
             Node<K,V> curr=buckets[index];
             while (curr.next!=null){
                 if(curr.key.equals(key)){
                     curr.value=value;
                     return;
                 }
                 curr=curr.next;
             }
             if(curr.key.equals(key)){
                 curr.value=value;
             }else {
                 curr.next=newNode;
             }
         }
         size++;
     }

     public void remove(K key){
         int index=getIndex(key);
         Node<K,V> curr=buckets[index];
         Node<K,V> pre=null;
         while (curr!=null){
             if(curr.key.equals(key)){
                 if(pre==null){
                     buckets[index]=curr.next;
                 }else{
                     pre.next=curr.next;
                 }
                 size--;
                 return;
             }
             pre=curr;
             curr=curr.next;
         }

     }
    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> curr = buckets[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }

        return null;
    }
     public  int size(){
         return  size;
     }

     public  int getIndex(K key){
         if(key==null){
             return  0;
         }
         return  Math.abs(key.hashCode()%buckets.length);
     }
     public static class Node<K,V>{
         private K key;
         private  V value;
         private  Node<K,V> next;
         public Node(K key,V value){
             this.key=key;
             this.value=value;
             this.next=null;
         }
     }
}
