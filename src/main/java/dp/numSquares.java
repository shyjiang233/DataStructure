package dp;

public class numSquares {
    public static void main(String[] args) {
        int n=13;
        int max=Integer.MAX_VALUE;
        int[] dp=new int[n+1];
        for (int j =0; j <=n ; j++) {
            dp[j]=max;
        }
        dp[0]=0;
        for (int j = 1; j <=n ; j++) {
            for (int i = 1; i*i <=j ; i++) {
                dp[j]=Math.min(dp[j-i*i]+1,dp[j]);
            }
        }
        System.out.println(dp[n]);
    }

}
