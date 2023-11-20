public class Solution12 {

    // 正数转罗马数字             
    // https://leetcode-cn.com/problems/integer-to-roman/

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String [] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV"};


    public String intToRoman(int num){

        StringBuffer sb = new StringBuffer();

        for(int i = 0;i < values.length;++i){

            int value = values[i];
            String symbol = symbols[i];

            while(num > value){
                num -= value;
                sb.append(symbol);
            }
            if(num == 0){
                break;
            }
        }
        return sb.toString();
    }
}
