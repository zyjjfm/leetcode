public class Solution14 {

    /**
    14. 最长公共前缀
    编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 ""。
    */
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        int length = strs[0].length();
        int count = strs.length;

        for(int i = 0; i < length; i++){

            char c = strs[0].charAt(i);

            for(int j = 1;j < count;j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){

                }
                
            }


        }
        return strs[0];
    }
}
