import java.util.ArrayList;
import java.util.List;

public class Solution914 {
    
    // 914. 卡牌分组
    /**
    给定一副牌，每张牌上都写着一个整数。
    此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
    每组都有 X 张牌。
    组内所有的牌上都写着相同的整数。
    仅当你可选的 X >= 2 时返回 true。

    */
    public boolean hasGroupsSizeX(int[] deck) {

        int N = deck.length;
        int[] count = new int[10000];

        for(int c:deck){
            count[c]++;
        }

        List<Integer> values = new ArrayList<Integer>();

        for(int i = 0;i<10000;++i){

            if(count[i] > 0){
                values.add(count[i]);
            }
        }

        for(int X = 2;X <= N;++X){

            if(N % X == 0){
                boolean flag = true;
                for(int v : values){
                    if(v % X != 0){
                        flag =false;
                        break;
                    }
                }
                if(flag){
                    return true;
                }
            }
        }

        return false;
    }
}
