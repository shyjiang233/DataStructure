package 哈希表;

import java.util.HashMap;

/*Author:shyjiang233
 *  Desc:383leetcode
 */public class canConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
     if(magazine.length()<ransomNote.length()){
         return  false;
     }
        HashMap<Character,Integer> map=new HashMap<>();
        char[] m=magazine.toCharArray();
        char[] r=ransomNote.toCharArray();
        for (int i = 0; i <magazine.length() ; i++) {
            if (!map.containsKey(m[i])){
                map.put(m[i],1);
            }else {
                map.put(m[i],map.get(m[i])+1);
            }
        }
        for (int i = 0; i <ransomNote.length() ; i++) {
         if(!map.containsKey(r[i])){
             return false;
         }else {
             map.put(r[i],map.get(r[i]-1));
         }
        }
        for (int n:map.values()){
            if(n<0){
                return  false;
            }
        }
        return  true;
    }
}
