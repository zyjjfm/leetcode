import java.util.Arrays;
import java.util.Comparator;

public class Solution452 {
    
    /**
     * 
     452. 用最少数量的剑引爆气球

        有一些球形气球贴在一堵用 XY 平面表示的墙面上。墙面上的气球记录在整数数组 points ，
        其中points[i] = [xstart, xend] 表示水平直径在 xstart 和 xend之间的气球。
        你不知道气球的确切 y 坐标。
    */
    public int findMinArrowShots(int[][] points) {

        if(points.length == 0){
            return 0;
        }

        Arrays.sort(points, new Comparator<int[]>() {

            @Override
            public int compare(int[] point1, int[] point2) {

                if(point1[1] > point2[1]){
                    return 1;
                }else if(point1[1] < point2[1]){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        int pos = points[0][1];
        int ans = 1;

        for(int[] balloon:points){
            if(balloon[0] > pos){
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}
