public class Solution1221 {
    
    // 1221. 分割平衡字符串 
    /*
     根据题意，对于一个平衡字符串 sss，若 sss 能从中间某处分割成左右两个子串，
     若其中一个是平衡字符串，则另一个的 L\texttt{L}L 和 R\texttt{R}R 字符的数量必然是相同的，所以也一定是平衡字符串。
      为了最大化分割数量，我们可以不断循环，每次从 sss 中分割出一个最短的平衡前缀，由于剩余部分也是平衡字符串，我们可以将其当作 sss 继续分割，直至 sss 为空时，结束循环。
    */
    public int balancedStringSplite(String s) {
        int ans = 0,d = 0;
        for(int i = 0;i<s.length();++i){

            char ch =s.charAt(i);
            
            if(ch == 'L'){
                ++d;
            }else{
                --d;
            }
            if(d == 0){
                ++ans;
            }

        }
        return ans;
    }
}
