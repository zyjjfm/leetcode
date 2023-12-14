import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution30 {

    /**
     * 
         30. 给定一个字符串 s 和一个字符串数组 words。 words 中所有字符串 长度相同。

    */
        public List<Integer> findSubstring(String s, String[] words) {

            List<Integer> res = new ArrayList<Integer>();
            int m = words.length,n = words[0].length(),ls = s.length();

            for(int i = 0;i < n;i++){
                if(i + m * n > ls){
                    break;
                }
                Map<String,Integer> differ = new HashMap<String,Integer>();

                for(int j = 0;j < m;j++){
                    String word = s.substring(i+j*n, i+(j+1)*n);
                    differ.put(word, differ.getOrDefault(word,0 ) + 1);
                }

                for(String word:words){

                    differ.put(word, differ.getOrDefault(word, 0) - 1);
                    if(differ.get(word) == 0){
                        differ.remove(word);
                    }

                
                for(int start = i;start < ls - m * n + 1; start += n){
                    
                    if(start != i){

                        String word = s.substring(start + (m - 1) * n,start + m * n);
                        differ.put(word, differ.getOrDefault(word, 0) + 1);
                        if(differ.get(word) == 0){
                            differ.remove(word);
                        }

                        word = s.substring(start - n, start);
                        differ.put(word, differ.getOrDefault(word, 0) - 1);

                        if(differ.get(word) == 0){
                            differ.remove(word);
                        }
                    }
                    if(differ.isEmpty()){
                        res.add(start);
                    }
                }
                }
            }
        return res;
    }
}






