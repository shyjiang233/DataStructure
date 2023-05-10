package dp;

public class LastStoneWeight2 {

    public static void main(String[] args) {
        int[] stones={2,7,4,1,8,1};
        int sum=0;
        for (int i :stones) {
            sum+=i;
        }
        int target=sum>>1;
        int[] dp=new int[target+1];
        for (int i = 0; i <stones.length ; i++) {
            for (int j = target; j >=stones[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        System.out.println(sum-2*dp[target]);
    }
}
