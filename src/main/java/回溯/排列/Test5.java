package 回溯.排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test5 {
}
class Solution6 {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {

        if(nums.length==0){
            return result;
        }
        used=new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueHelp(nums);
       return  result;
    }

    private void permuteUniqueHelp(int[] nums) {
      if(nums.length==path.size()){
          result.add(new ArrayList<>(path));
          return;
      }
        for (int i = 0; i <nums.length ; i++) {
             if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false){
                 continue;
             }
             if(used[i]==false){
             used[i]=true;
             path.add(nums[i]);
             permuteUniqueHelp(nums);
             path.removeLast();
             used[i]=false;
        }}
    }
}