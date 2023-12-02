import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution151 {
    
    // 151. 反转字符串中的单词
    
    // 翻转字符串里的单词 

    public String reverseWords(String s) {

        // 除去开头和末尾的空白字符
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));

        Collections.reverse(wordList);

        return String.join(" ", wordList);
    }
}
