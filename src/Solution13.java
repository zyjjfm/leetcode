import java.util.HashMap;
import java.util.Map;

public class Solution13 {

    // 13. 罗马数字转整数         
    // https://leetcode.cn/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150

      Map<Character,Integer> symbolValues = new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};


    public int romanToInt(String s){

        int ans = 0;
        int n = s.length();

        for(int i = 0;i< n;++i){    

            int value = symbolValues.get(s.charAt(i));

            if(i < n -1 && value < symbolValues.get(s.charAt(i+i))){

                ans -= value;

            }else{
                ans += value;
            }
            
        }
        
        return ans;
    }
}
