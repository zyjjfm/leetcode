import java.util.Arrays;

public class Solution88 {

    /**
      76 最小子覆盖子串
    */
    
   public String minWindow(String s, String t) {

    int sLen = s.length();
    int tLen = t.length();

    if(sLen == 0 || tLen == 0 || sLen < tLen){
        return "";
    }
    char[] charArrayS = s.toCharArray();
    char[] charArrayT = t.toCharArray();

    int [] winFreq = new int[128];
    int [] tFreq = new int[128];

    for(char c:charArrayT){
        tFreq[c]++;
    }


    // 滑动窗口算法需要的变量  滑动窗口内部包含多少T钟的字符，对应字符频数超过不重复计算
    int distance = 0;
    int minLen = sLen + 1;
    int begin = 0;

    int left = 0;
    int right = 0;
    // [left,right) 

    while (right < sLen) {
        if(tFreq[charArrayS[right]] == 0){
            right ++;
            continue;
        }

        if(winFreq[charArrayS[right]] < tFreq[charArrayT[right]]){
            distance ++;
        }
        winFreq[charArrayS[right]]++;
        right ++;

        while (distance == tLen) {

            if(right - left < minLen){
                minLen = right - left;
                begin = left;
            }

            if(tFreq[charArrayS[left]] == 0){
                left ++ ;
                continue;
            }

            if(winFreq[charArrayS[left]] == tFreq[charArrayS[left]]){
                distance --;
            }
            winFreq[charArrayS[left]]--;
            left ++;

        }
    }

    if(minLen == sLen +1){
        return "";
    } 
    return s.substring(begin, begin+minLen);
    }
}






