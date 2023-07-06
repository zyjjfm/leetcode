public class Solution844 {

    /**
     比较含退格的字符串
     给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
    */

        public boolean backspaceCompare(String S,String T){

            return build(S).equals(build(T));
     }

     public String build(String str){

        StringBuffer ret = new StringBuffer();
        int length =str.length();
        for(int i = 0;i<length;++i){
            char ch = str.charAt(i);
            if(ch != '#'){
                ret.append(ch);
            }else{
                if(ret.length() > 0){
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }
}