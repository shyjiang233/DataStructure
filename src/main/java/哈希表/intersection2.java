package 哈希表;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Author:shyjiang233
 *  Desc:349
 */public class intersection2 {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<>();
        for (int i = 0; i <nums1.length ; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length ; i++) {
            if(set.contains(nums2[i])){
               set2.add(nums2[i]);

            }
        }
        return set2.stream().mapToInt(x->x).toArray();
    }
}
