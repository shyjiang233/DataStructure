package 哈希表;

import java.util.HashMap;
import java.util.Map;

/*Author:shyjiang233
 *  Desc:454
 */public class foursumcount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
       int res=0;
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for (int i:nums1){
            for (int j :nums2) {
                int sum=i+j;
                map.put(sum,map.getOrDefault(i+j+1,0));
            }
        }
        for (int i:nums3) {
            for (int j :nums4) {
                res+=map.getOrDefault(0-i-j,0);
            }
        }
        return res;
    }
}
