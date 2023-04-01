package 贪心;
/*跳跃游戏 II*/
public class Test11 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        Solution3 solution3=new Solution3();
        System.out.println(solution3.jump(nums));
    }
}


class Solution3 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        //记录跳跃次数
        int count = 0;
        //当前覆盖的最大区域
        int cur = 0;
        //记录下一步覆盖区域
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            next = Math.max(next, i + nums[i]);
            if (i == cur) {
                if (cur != nums.length - 1) {
                    count++;
                    cur = next;
                    if(cur>=nums.length-1){
                        break;
                    }
                }
            }else {
                count++;
                break;
            }
        }
        return count;
    }
}