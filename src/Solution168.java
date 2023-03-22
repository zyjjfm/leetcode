public class Solution168 {
/*
168. Excel表列名称
给你一个整数 columnNumber ，返回它在Excel表中相对应的列名称。
*/
public String convertToTitle(int columnNumber){

    StringBuffer sb = new StringBuffer();

    while(columnNumber > 0){

        int a0 = (columnNumber - 1)%26 +1;
        sb.append((char)(a0 + 'A' - 1));
        columnNumber = (columnNumber - a0)/26;
    }
    return sb.reverse().toString();
}
    }
