package 哈希表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*两个数组的交集*/
public class InterSection {
    public int[] intersection(int[] nums1, int[] nums2) {


        Set<Integer> set2=new HashSet<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set2.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set2.contains(nums2[i])){
                set.add(nums2[i]);
            }
        }

        return set.stream().mapToInt(x->x).toArray();
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)<0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
