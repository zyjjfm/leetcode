import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution139 {
    public static boolean  wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> wordDictSet = new HashSet(wordDict);

        boolean[] dp = new boolean[s.length()+1];

        dp[0] = true;

        for(int i = 1;i < s.length();i++){

            for(int j = 0;j < i; j++){
                if(dp[j] && wordDictSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }

            }

        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        
        // s = "applepenapple", wordDict = ["apple", "pen"]

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pen");

        System.out.println(wordBreak("applepenapple", list));
    }
}