package LRU算法;

public class Test {
    public static void main(String[] args) {
        LRUCache<Integer ,String> lruCache=new LRUCache<>(2);
        lruCache.put(1,"dsfs");
        lruCache.put(2,"Effffef");
        System.out.println(lruCache.get(2));
    }
}
