package niuke;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
public  class Test1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tmp=sc.nextInt();
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        for (int i = 1; i <= tmp; i++) {
            String str=sc.nextLine();
            for (int j = 0; j <str.length() ; j++) {
                char ch=str.charAt(j);
                set.add(ch);
            }
            if(set.contains('B')&&set.contains('a')&&set.contains('i')&&set.contains('d')&&set.contains('u')){
                System.out.println("Yes");
                set.clear();

            }else {
                System.out.println("No");
                set.clear();
            }
        }
}}


