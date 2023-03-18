package 回溯.排列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
       Solution solution=new Solution();
       int[] a={1,2,3};
       List<List<Integer>> list=solution.permute(a);
        System.out.print(list+" ");
    }
}
class Solution{
    List<List<Integer>>   result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    boolean[] used;
    public  List<List<Integer>> permute(int[] nums){
         if(nums.length==0){
             return result;
         }
         used=new boolean[nums.length];
         permuteHelper(nums);
         return  result;
    }

    private void permuteHelper(int[] nums) {
        if(path.size()==used.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(used[i]){
                continue;
            }else {
                used[i]=true;
                path.add(nums[i]);
                permuteHelper(nums);
                path.removeLast();
                used[i]=false;
            }

        }
    }


}
