import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution20 {
    /**
     * 
     * 
     *   20 有效的括号
            给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
            有效字符串需满足：
            左括号必须用相同类型的右括号闭合。
            左括号必须以正确的顺序闭合。
            每个右括号都有一个对应的相同类型的左括号。


    */
    public boolean isValid(String s) {

        int n = s.length();

        if(n % 2 == 1){

            return false;
        }

        Map<Character,Character> pairs = new HashMap<Character, Character>();
        
        pairs.put(')', '(');

        pairs.put(']', '[');

        pairs.put('}', '{');

        Deque<Character> stack = new LinkedList<Character>();

        for(int i = 0;i < n ;i++){

            char ch = s.charAt(i);

            if(pairs.containsKey(ch)){

                if(pairs.isEmpty() || stack.peek() != pairs.get(ch)){
                   return false; 
                }
                
                stack.pop();

            }else{

                stack.push(ch);
                
            }
        }

        return stack.isEmpty();
    }
}
