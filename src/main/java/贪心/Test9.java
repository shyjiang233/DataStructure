package 贪心;
/*跳跃游戏*/
public class Test9 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a={2,2,1,0,1};
        System.out.println(solution.canJump(a));
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int cover=0;
        for(int i=0;i<=cover;i++){
            cover=Math.max(cover,i+nums[i]);
            if(cover>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}