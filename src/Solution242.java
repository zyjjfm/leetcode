
public class Solution242 {

  /**
   
     给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

   * 标签：哈希映射 
   * 首先判断两个字符串长度是否相等，不相等则直接返回 false
   * 若相等，则初始化 26 个字母哈希表，遍历字符串 s 和 t
   * s 负责在对应位置增加，t 负责在对应位置减少
   * 如果哈希表的值都为 0，则二者是字母异位词
   
   */

  public boolean isAnagram(String s, String t) {

    if(s.length() != t.length()){
      return false;
    }
    
    int[] alpha = new int[26];

    for(int i = 0;i < s.length();i++){

      alpha[s.charAt(i) - 'a']++;
      alpha[t.charAt(i) - 'a']--;

    }

    for(int i = 0;i < 26;i++){
      
    }




  

    return true;
  }

}
