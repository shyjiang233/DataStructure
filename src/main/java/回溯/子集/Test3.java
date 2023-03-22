package 回溯.子集;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num={1,2,3};
        List<List<Integer>> result=solution.subset(num);
        System.out.println(result);
    }
}
class Solution{
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
public  List<List<Integer>> subset(int[] nums){
        subsethelp(nums,0);
        return  result;
    }

    private void subsethelp(int[] nums, int startINdex) {
        result.add(new ArrayList<>(path));
        if(startINdex>=nums.length){
            return;
        }
        for(int i=startINdex;i<nums.length;i++){
            path.add(nums[i]);
            subsethelp(nums,i+1);
            path.removeLast();
        }
    }


}