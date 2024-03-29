public class Solution492 {

    // 492. 构造矩形
    public int[] constructRectangle(int area) {
    

        int w = (int)Math.sqrt(area);

        while(area % w != 0){
            --w;
        }
        
        return new int[]{ area / w,w};

    }
}
