public class Solution383 {
    
    // 383. 赎金信
    /**
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
        如果可以，返回 true ；否则返回 false 。
        magazine 中的每个字符只能在 ransomNote 中使用一次。
    */
    public boolean canConstruct(String ransomNote, String magazine) {
        
        //判断长度大小
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        // 26个字母组成
        int[] cnt = new int[26];
        for(char c :magazine.toCharArray()){
            cnt[c -'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            cnt[c - 'a'] --;
            if(cnt[c - 'a'] < 0){
                return false;
            }

        }
        return true;
    }
}
