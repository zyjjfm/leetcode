import java.util.ArrayList;
import java.util.List;

public class Solution401 {

    // 401. 二进制手表
    // 二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。
    // 每个 LED 代表一个 0 或 1，最低位在右侧。
      public List<String> readBinaryWatch(int turnedOn) {

        List<String> ans = new ArrayList<String>();
        for(int h = 0;h < 12;++h){
            for(int m = 0;m < 60;++m){
                if(Integer.bitCount(h)+Integer.bitCount(m) == turnedOn){
                    ans.add(h + ":" +(m < 10 ? "0" : "") + m);
                }
            }
        }
        return ans;
    }
}






