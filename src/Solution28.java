public class Solution28 {

    /*
    
    找到字符串中第一个匹配项的下标

    实现 strStr()

    给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
    如果 needle 不是 haystack 的一部分，则返回  -1 。

    输入：haystack = "sadbutsad", needle = "sad"
    输出：0
    解释："sad" 在下标 0 和 6 处匹配。
    第一个匹配项的下标是 0 ，所以返回 0。
    */

    public int strStr(String haystack, String needle){

        int n = haystack.length();
        int m = needle.length();

        for(int i = 0;i+m <= n;i++){

            boolean flag = true;

            for(int j = 0;j < m;j++){

                if(haystack.charAt(i + j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
                
            }
        }
        return -1;
    }
}






