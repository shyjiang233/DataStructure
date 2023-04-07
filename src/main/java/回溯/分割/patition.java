package 回溯.分割;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*分割回文串*/
public class patition {
    List<List<String>> result=new ArrayList<>();
    LinkedList<String> path=new LinkedList<>();
   public  List<List<String>> partition(String s){
       if(s.length()==1){
           return  result;
       }
       backTracking(s,0);
     return  result;
   }

    private void backTracking(String s, int startIndex) {

       
    }

}
