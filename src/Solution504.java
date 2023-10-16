public class Solution504 {
    
    // 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
    // 504  七进制  

    public String convertToBase7(int num) {
        if(num == 0){

            return "0";
        }
       
        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuffer digits = new StringBuffer();

        while(num > 0){
             digits.append(num % 7);
             num /= 7;
        }

        if(negative){
            digits.append('-');
        }
    return digits.reverse().toString();
    }
}






