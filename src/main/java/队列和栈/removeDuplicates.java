package 队列和栈;

import java.util.Deque;
import java.util.LinkedList;

/*Author:shyjiang233
 *  Desc:
 */public class removeDuplicates {
    public String removeDuplicates(String s) {

        Deque<Character> deque=new LinkedList<>();
        char ch;
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            if(deque.isEmpty()||deque.peek()!=ch){
                deque.push(ch);
            }else {
                deque.pop();
            }
        }
        String str="";
        while (!deque.isEmpty()){
            str=deque.pop()+str;
        }
        return str;


    }
}
