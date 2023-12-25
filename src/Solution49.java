import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution49 {

    /**
     
    49 字母异位词分组

    给你一个字符串数组，请你将 字母异位词 组合在一起。
    可以按任意顺序返回结果列表。
    */
    
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<String,List<String>>();

        for(String str: strs){
            char[] array = str.toCharArray();

            Arrays.sort(array);

            String key = new String(array);

            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);





        }




        return null;
    }
}






