package dp;

/*Author:shyjiang233
 *  Desc:516
 */public class longestPalindromeSubseq {
    public int longestPalindromeSubseq(String s) {
          char[] ch=s.toCharArray();
          int len=s.length();
          int[][] dp=new int[len+1][len+1];
        for (int i =len-1; i >=0 ; i--) {
          dp[i][i]=1;
            for (int j = i+1; j <len; j++) {
                 if(ch[i]==ch[j]){
                     dp[i][j]=dp[i+1][j-1]+2;
                 }else {
                     dp[i][j] = Math.max(dp[i + 1][j], Math.max(dp[i][j], dp[i][j - 1]));
                 }
            } 
            }

          
          
          return  dp[0][len-1];
    }  
}
