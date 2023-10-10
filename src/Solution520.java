public class Solution520 {
    
    /**
          520. 检测大写字母

        我们定义，在以下情况时，单词的大写用法是正确的：
        全部字母都是大写，比如 "USA" 。
        单词中所有字母都不是大写，比如 "leetcode" 。
        如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
        给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。

    */
   public boolean detectCapitalUse(String word) {

    // 若第一个字母为小写，则额外判断第二个字母是否为小写
    if(word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
        
        return false;
    }
    // 无论 第一个 字母是否大写，其他字母必须与第二个字母大小写相同
    for(int i = 2;i<word.length();++i){
            if(Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1))){
                return false;
            }
    }
    return true;
    }
}
