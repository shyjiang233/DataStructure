package 哈希表;

import java.util.HashMap;

/*Author:shyjiang233
 *  Desc:leetcode242
 */public class isAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if (!map.containsKey(s1[i])){
                map.put(s1[i],1);
            }else {
           map.put(s1[i],map.get(s1[i])+1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t1[i])){
             map.put(t1[i],map.get(t1[i])-1);
            }else {
                return false;
            }
        }
        for (int count:map.values()){
            if(count!=0){
                return false;
            }
        }
        return  true;
    }
}
