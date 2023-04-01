package 贪心;

import java.util.Arrays;
import java.util.stream.IntStream;
/*K 次取反后最大化的数组和*/
public class Test10 {






}
class Solution2 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums= IntStream.of(nums).boxed().sorted((o1,o2)->Math.abs(o2)-Math.abs(o1)).mapToInt(Integer::intValue).toArray();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0&&k>0){
                nums[i]=-nums[i];
                k--;
            }
        }
        int len=nums.length;
        if(k%2==1){
            nums[len-1]=-nums[len-1];
        }
        return Arrays.stream(nums).sum();
    }
}