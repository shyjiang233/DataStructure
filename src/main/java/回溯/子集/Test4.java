package 回溯.子集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        int[] nums={1,2,3,3};
        Solution2 solution2=new Solution2();
        List<List<Integer>> result=solution2.subsetsWithDup(nums);
        System.out.println(result);
    }
}
class Solution2 {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Boolean[] used=new Boolean[nums.length];
        Arrays.sort(nums);
          subsetsHelp(nums,0,used);
          return  result;
    }

    private void subsetsHelp(int[] nums, int startIndex, Boolean[] used) {
            result.add(new ArrayList<>(path));
            if(nums.length==startIndex){
                return;
            }
            for (int i=startIndex;i<nums.length;i++){
                if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                      continue;
                }
                path.add(nums[i]);
                used[i]=true;
                subsetsHelp(nums,i+1,used);
                path.removeLast();
                used[i]=false;
            }


    }
}