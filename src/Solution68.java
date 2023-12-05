import java.util.ArrayList;
import java.util.List;

public class Solution68 {

    /**

    给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
    你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
    要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。

     * 
    */

    // 68 文本左右对齐
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<String>();

        int right = 0,n = words.length;

        while(true){

        int left = right; //当前恒的第一个单词在 words的位置。
        int sumLen = 0;
        
        // 循环确定当前行可以放多少单词，注意单词之间应至少有一个空格
        while(right < n && sumLen + words[right].length() + right - left <= maxWidth){
            sumLen += words[right++].length();
        }

        // 当前行是最后一行：单词左对齐，且单词之间应只有一个空格，在行末填充剩余空格
        if(right == n){
            StringBuffer sb =  join(words,left,n, " ");
            sb.append(blank(maxWidth - sb.length()));
            ans.add(sb.toString());
            return ans;
        }

        int numWords = right - left;
        int numSpaces = maxWidth - sumLen;

        // 当前只有一个单词，该单词左对齐，在行末填充剩余空格
        if(numWords == 1){
            StringBuffer sb = new StringBuffer(words[left]);
            sb.append(blank(numSpaces));
            ans.add(sb.toString());
            continue;
        }
        //当前行不止一个单词
        int avgSpace = numSpaces / (numWords - 1);
        int extraSpaces = numSpaces % (numWords - 1);
        StringBuffer sb = new StringBuffer();

        sb.append(join(words, left, right+extraSpaces,blank(avgSpace+1))); // 拼接额外加一个空间的单词
        sb.append(blank(avgSpace));
        sb.append(join(words,left + extraSpaces + 1,right,blank(avgSpace)));
        ans.add(sb.toString());
        
        }
    }

    //blank 返回长度为 n 的空格组成的字符串
    public String blank(int n){

        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < n; ++i){
            sb.append(' ');
        }
        return sb.toString();
    }

    // join 返回用 sep 拼接 [left, right) 范围内的 words 组成的字符串
    public StringBuffer join(String[] words,int left,int right,String sep){

        StringBuffer sb = new StringBuffer(words[left]);
        for(int i = left +1;i < right;++i){
            sb.append(sep);
            sb.append(words[i]);
        }
        return sb; 
    }



}
