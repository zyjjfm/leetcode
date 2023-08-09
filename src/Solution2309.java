import java.util.HashSet;
import java.util.Set;

public class Solution2309 {
    
    // 2309. 兼具大小写的最好英文字母
    /**
        给你一个由英文字母组成的字符串 s ，请你找出并返回 s 中的 最好 英文字母。
        返回的字母必须为大写形式。如果不存在满足条件的字母，则返回一个空字符串。
        最好 英文字母的大写和小写形式必须 都 在 s 中出现。
        英文字母b比另一个英文字母a更好的前提是：英文字母表中，b在a之后出现。
    */

    public String greatestLetter(String s){

        Set<Character> ht = new HashSet<Character>();

        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            ht.add(c);
        }
        for(int i = 25;i >= 0;i--){
            if(ht.contains((char)('a'+i)) && ht.contains((char)('A'+i))){
                return String.valueOf((char)('A'+i));
            }
        }
     return "";
    }
}
