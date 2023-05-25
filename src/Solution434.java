
public class Solution434 {

    //434. 字符串中的单词数

    /**
      统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
      请注意，你可以假定字符串里不包括任何不可打印的字符。

      输入: "Hello, my name is John"
      输出: 5
      解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作1个单词
    */

     public int  countSegment(String s){

      int segmentCount = 0;

      for(int i = 0;i < s.length();i++){
        if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' '){
          
          segmentCount ++;

        }
      }
      return segmentCount;
     }
}
