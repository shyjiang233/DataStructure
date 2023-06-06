package 队列和栈;

import java.util.Deque;
import java.util.LinkedList;

/*Author:shyjiang233
 *  Desc:150
 */public class evalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new LinkedList<>();
        for (String s:tokens) {
            if("+".equals(s)){
                stack.push(stack.pop()+stack.pop());
            }else  if("-".equals(s)){
                stack.push(-stack.pop()+stack.pop());
            }else if("*".equals(s)){
                stack.push(stack.pop()*stack.pop());
            }else if("/".equals(s)){
                int temp=stack.pop();
                int temp2=stack.pop();
                int temp3=temp2/temp;
                stack.push(temp3);
            }else {
                stack.push(Integer.valueOf(s));
            }
        }



        return  stack.pop();
    }
}
