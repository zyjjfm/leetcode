import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution819 {
/**

819. 最常见的单词 
给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
题目保证至少有一个词不在禁用列表中，而且答案唯一。
禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。

*/

public String mostCommonWord(String paragraph,String [] banned){

    Set<String> bannedSet = new HashSet<String>();
    for(String word:banned){
        bannedSet.add(word);
    }

    int maxFrequenry = 0;
    
    Map<String,Integer> frequenries = new HashMap<String,Integer>();

    StringBuffer sb = new StringBuffer();
    int length = paragraph.length();

    for(int i = 0;i < length;i++){

        if( i < length && Character.isLetter(paragraph.charAt(i))){
            sb.append(Character.toLowerCase(paragraph.charAt(i)));
        } else if(sb.length() > 0){

            String word = sb.toString();
            if(!bannedSet.contains(word)){

                int frequenry = frequenries.getOrDefault(word, 0)+1;
                frequenries.put(word, frequenry);
                maxFrequenry = Math.max(maxFrequenry, frequenry);
            }
            sb.setLength(0);
        }
    }

    String mostCommon = "";

    Set<Map.Entry<String,Integer>> entries = frequenries.entrySet();

    for(Map.Entry<String,Integer> entry:entries){

        String word = entry.getKey();
        int frequenry = entry.getValue();
        if(frequenry == maxFrequenry){
            mostCommon = word;
            break;
        }
    }
    return mostCommon;
}

}
