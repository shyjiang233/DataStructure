package dp;

public class fib {
    public static void main(String[] args) {
       int b=fib(6);
        System.out.println(b);
    }
    public  static int fib(int n) {
        if(n<2){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            System.out.println(dp[i]);
        }
        dp[n]=dp[n-1]+dp[n-2];
        return dp[n];
    }
}
