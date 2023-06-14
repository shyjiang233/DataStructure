package dp;

import java.util.Arrays;

/*Author:shyjiang233
 *  Desc:674
 */public class findLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp=new int[nums.length];
        int res=1;
        Arrays.fill(dp,1);
        for (int i = 1; i < nums.length; i++) {

            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }
            res = res > dp[i] ? res : dp[i];
        }

        return res;
    }
}
