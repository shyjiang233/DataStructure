package dp;

public class coinChange {
    public static void main(String[] args) {
        int coins[]={1,2,5};
        int amount=11;
        int[] dp=new int[amount+1];
        for (int j = 0; j <amount ; j++) {
            dp[j]=Integer.MAX_VALUE;
        }
        dp[0]=0;
        for (int i = 0; i <coins.length ; i++) {
            for (int j =coins[i]; j <=amount ; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
                    //选择硬币数目最小的情况
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        int i = dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
        System.out.println(i);
    }
}
