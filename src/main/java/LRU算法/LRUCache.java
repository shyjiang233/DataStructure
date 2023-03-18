package LRU算法;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K,V> {
     private final  int capcity ;
     private final Map<K,Node<K,V>> cache;
     private  final Node<K,V>  head;
     private  final  Node<K,V> tail;
     public LRUCache(int capcity){
         this.capcity=capcity;
         this.cache=new HashMap<>(capcity);
         this.head=new Node<>(null,null);
         this.tail=new Node<>(null,null);
         this.head.next=tail;
         this.tail.prev=head;
     }
     public  void put(K key,V value){
       Node<K,V> node=cache.get(key);
       if(node==null){
           node=new Node<>(key,value);
           cache.put(key,node);
           addNode(node);
           if(cache.size()>capcity){
               Node<K,V> removed=removeTail();
               cache.remove(removed.key);
           }
       }else {
           node.value = value;
           moveToHead(node);
       }
     }

    private Node<K,V> removeTail() {
         Node<K,V> removed=tail.prev;
         removeNode(removed);
         return  removed;
    }

    public  V get(K key){
         Node<K,V> node=cache.get(key);
         if(node==null){
             return  null;
         }
         moveToHead(node);
         return  node.value;
     }
     //使用头插法
    private void addNode(Node<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void removeNode(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }


    private void moveToHead(Node<K,V> node) {
         removeNode(node);
         addNode(node);
    }

}
 class Node<K, V> {
    K key;
    V value;
    Node<K, V> prev;
    Node<K, V> next;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}