package 回溯.组合;

import java.util.*;

public class TestletterCombination {
     List<String> result=new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return  result;
        }
        Map<Integer,String> phonemap=new HashMap<>();
        phonemap.put(2,"abc");
       phonemap.put(3, "def");
        phonemap.put(4, "ghi");
        phonemap.put(5,"jkl");
        phonemap.put(6,"mno");
        phonemap.put(7,"pqrs");
        phonemap.put(8,"tuv");
        phonemap.put(9,"wxyz");
        letterCombinationshelper(phonemap,digits,0,new StringBuffer());
        return  result;
    }

    private void letterCombinationshelper( Map<Integer, String> phonemap, String digits, int index, StringBuffer path) {
     if(index==digits.length())
       result.add(path.toString());
        int value= digits.charAt(index);
        String letters=phonemap.get(value);
        int lettersCount=letters.length();
        for (int i = 0; i <lettersCount ; i++) {
             path.append(letters.charAt(i));
                letterCombinationshelper(phonemap,digits,index+1,path);
                path.deleteCharAt(index);
        }}
}
