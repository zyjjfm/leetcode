public class Solution408 {
    
    // 408
    // 字符串可以用 缩写 进行表示，缩写 的方法是将任意数量的 不相邻 的子字符串替换为相应子串的长度。

    /**
     
        "s10n" ("s ubstitutio n")
        "sub4u4" ("sub stit u tion")
        "12" ("substitution")
        "su3i1u2on" ("su bst i t u ti on")
        "substitution" (没有替换子字符串)
        下列是不合法的缩写：
        "s55n" ("s ubsti tutio n"，两处缩写相邻)
        "s010n" (缩写存在前导零)
        "s0ubstitution" (缩写是一个空字符串)

        每次遇到数值，都需要完整遍历这部分的位置，然后就可以很好的判断出前导零了，重拳出击
    */

    public boolean validWordAbbreviation(String word, String abbr) {

        int index = 0;
        int pos = 0;

        while(pos < abbr.length() && index< word.length() ){
            if(Character.isDigit(abbr.charAt(pos))){

                if(abbr.charAt(pos) == '0'){
                    return false;
                }

                int num = 0;
                while(pos < abbr.length() && Character.isDigit(abbr.charAt(pos))){
                    num = num * 10 +abbr.charAt(pos) - '0';
                    pos ++;
                }
                if(word.length() - index < num){
                    return false;
                }
                index += num;

            }else{
                if(word.charAt(index) != abbr.charAt(pos)){
                    return false;
                }
                index ++ ;
                pos ++;

            }
        }
        return pos == abbr.length() && index == word.length();
    }
}
