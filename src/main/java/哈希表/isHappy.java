package 哈希表;

import java.util.HashSet;
import java.util.Set;

/*Author:shyjiang233
 *  Desc:leetcode 202
 */public class isHappy {

      public boolean isHappy(int n) {
       Set<Integer> hashset=new HashSet<>();
        while (n!=1&&!hashset.contains(n)){
            hashset.add(n);
             n=getNumber(n);
        }
        return n==1;
     }

 private int getNumber(int n) {
          int res=0;
          while (n>0){
              int temp=n%10;
              res+=temp*temp;
              n=n/10;
          }
          return  res;
 }

}
