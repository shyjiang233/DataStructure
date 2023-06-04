package 哈希表;

import java.util.HashMap;

/*Author:shyjiang233
 *  Desc:
 */public class twoSum {
    public int[] twoSum(int[] nums, int target) {
           int[] n=new int[2];
           if(nums==null||nums.length==0){
               return null;
           }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                n[1]=map.get(temp);
                n[0]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return n;
    }
}
