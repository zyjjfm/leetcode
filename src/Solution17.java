import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution17 {
    
    //电话号码的字母组合

    /*
    
    回溯
    首先使用哈希表存储每个数字对应的所有可能的字母，然后进行回溯操作。

    回溯过程中维护一个字符串，表示已有的字母排列（如果未遍历完电话号码的所有数字，则已有的字母排列是不完整的）。
    该字符串初始为空。每次取电话号码的一位数字，从哈希表中获得该数字对应的所有可能的字母，并将其中的一个字母插入到已有的字母排列后面，然后继续处理电话号码的后一位数字，直到处理完电话号码中的所有数字，
    即得到一个完整的字母排列。然后进行回退操作，遍历其余的字母排列。

    回溯算法用于寻找所有的可行解，如果发现一个解不可行，则会舍弃不可行的解。在这道题中，由于每个数字对应的每个字母都可能进入字母组合，
    因此不存在不可行的解，直接穷举所有的解即可。

    */
    
  public static List<String>  letterCombinations(String digits){

    List<String> combinations = new ArrayList<>();
    if(digits.length() == 0){
        return combinations;
    }

    HashMap<Character,String> phoneMap = new HashMap<Character,String>();

    phoneMap.put('2', "abc");
    phoneMap.put('3', "def");
    phoneMap.put('4', "ghi");
    phoneMap.put('5', "jkl");
    phoneMap.put('6', "mno");
    phoneMap.put('7', "pqrs");
    phoneMap.put('8', "tuv");
    phoneMap.put('9', "wxyz");

    return combinations;
  }
  public  static void  backtrack(List<String> combinations,HashMap<Character,String> phoneMap,String digits,int index,StringBuffer combination){

    if(index == digits.length()){
    combinations.add(combination.toString());
    }else{
        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        int lettersCount = letters.length();

        for(int i = 0;i<lettersCount;i++){
            combination.append(letters.charAt(i));
            backtrack(combinations, phoneMap, digits, index+1, combination);
            combination.deleteCharAt(index);
        }
    }
  }
}
