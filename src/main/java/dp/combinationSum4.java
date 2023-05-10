package dp;

public class combinationSum4 {
    public static void main(String[] args) {
        int nums[] ={1,2,3};
        int target=4;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        for (int maxvalue:dp){
            System.out.println(maxvalue);
        }
    }
}