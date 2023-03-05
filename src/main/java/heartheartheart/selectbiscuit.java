package heartheartheart;

import java.util.Arrays;

public class selectbiscuit {
    public static void main(String[] args) {
         int[] g={2,3,4,5};
         int[] s={1,3,5,7};
         int count=findContentChildren(g,s);
        System.out.println(count);
    }
    public  static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int start=0;
        for (int i = 0; i <s.length&&start<g.length ; i++) {
            if(s[i]>=g[start]){
                count++;
                start++;
            }
        }
        return  count;
    }
}
