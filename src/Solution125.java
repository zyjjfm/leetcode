public class Solution125 {
    
    // 125.验证回文字符串
    // 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
    // 字母和数字都属于字母数字字符。给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
        public boolean isPalindrome(String s) {

            StringBuffer sgood = new StringBuffer();
            int length = s.length();

            for(int i= 0;i < length; i++){

                char ch = s.charAt(i);

                if(Character.isLetterOrDigit(ch)){
                    
                    sgood.append(Character.toLowerCase(ch));
                }
            }

            StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
            
            return sgood_rev.toString().equals(sgood.toString());
        }
}
