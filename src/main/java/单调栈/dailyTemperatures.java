package 单调栈;

import java.util.Deque;
import java.util.LinkedList;

/*Author:shyjiang233
 *  Desc:739
 */public class dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
         int lens=temperatures.length;
         int[] re=new int[lens];
        Deque<Integer> stack=new LinkedList<>();
        stack.push(0);
        for (int i = 1; i <lens ; i++) {
            if(temperatures[i]<=temperatures[stack.peek()]){
                stack.push(i);
            }else {
                while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                    re[stack.peek()]=i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return  re;
    }
}
