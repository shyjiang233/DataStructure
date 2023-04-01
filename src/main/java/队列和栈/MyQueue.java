package 队列和栈;

import java.util.Stack;

/*用栈实现队列*/
public class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackout;
    public  MyQueue(){
        stackIn=new Stack<>();//负责入栈
        stackout=new Stack<>();//负责出栈
    }
    public void push(int x){
        stackIn.push(x);
    }
    public  boolean empty(){
       return stackIn.isEmpty()&&stackout.isEmpty();
    }
    public int pop(){
        dumpstackIn();
        return stackout.pop();
    }
    public  int peek(){
        dumpstackIn();
        return stackout.peek();
    }
    //如果stackout为空，那么将stackIn中的元素加进去
    public void  dumpstackIn(){
        if(!stackout.isEmpty())return;
        while (!stackIn.isEmpty()){
            stackout.push(stackIn.pop());
        }
    }
}
