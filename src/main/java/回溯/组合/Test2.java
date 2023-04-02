package 回溯.组合;

import java.util.*;
public class Test2 {
    List<List<Integer>>  result=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         Arrays.sort(candidates);
        combinationSumHelper(candidates,target,new ArrayList<>(),0,0);
        return result;
    }
    void  combinationSumHelper(int[] candidates,int target,List<Integer> path,int sum,int index){
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i <candidates.length ; i++) {
            if(sum>target){
                break;
            }
            path.add(candidates[i]);
            combinationSumHelper(candidates,target,path,sum+candidates[i],0);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
