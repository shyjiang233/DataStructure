package 哈希表;

/*Author:shyjiang233
 *  Desc:
 */public class Main {
    public static void main(String[] args) {
        MyHash<String, Integer> hashMap = new MyHash<>();

        // 添加键值对
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("orange", 7);

        // 输出键值对数量
        System.out.println("Size: " + hashMap.size()); // Size: 3

        // 获取值
        System.out.println("Value of 'apple': " + hashMap.get("apple")); // Value of 'apple': 10
        System.out.println("Value of 'banana': " + hashMap.get("banana")); // Value of 'banana': 5
        System.out.println("Value of 'orange': " + hashMap.get("orange")); // Value of 'orange': 7

        // 删除键值对
        hashMap.remove("banana");

        // 输出键值对数量
        System.out.println("Size: " + hashMap.size()); // Size: 2

        // 获取删除后的值
        System.out.println("Value of 'banana': " + hashMap.get("banana")); // Value of 'banana': null
    }
}
