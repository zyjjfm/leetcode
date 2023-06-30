public class Solution409 {
    
    /**
     * 
     409. 最长回文串

     给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
     在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。


    */
     public int longestPalindrome(String s) {

            int[] count = new int[128];
            int length = s.length();
            int ans = 0;

            for(int i = 0;i<length;i++){
                char c = s.charAt(i);
                count[c]++;
            }
            for(int v:count){
                ans += v / 2 * 2;
                if(v % 2 == 1 && ans % 2 == 0){
                    ans ++;
                }
            }
            
        return ans;
    }
}
