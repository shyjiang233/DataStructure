package 链表;
/*当字符串数组长度为 0 时则公共前缀为空，直接返回；
令最长公共前缀 ans 的值为第一个字符串，进行初始化；
遍历后面的字符串，依次将其与 ans 进行比较，两两找出公共前缀，最终结果即为最长公共前缀；
如果查找过程中出现了 ans 为空的情况，则公共前缀不存在直接返回；
时间复杂度：

O(s)，s 为所有字符串的长度之和。

*/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length()==0)return "";
                //公共前缀不匹配就让它变短！
                s=s.substring(0,s.length()-1);
            }
        }
        return s;

    }

}
