public class Solution135 {
    
    /**
     * 135. 分发糖果 
     * 
     *  n个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
        你需要按照以下要求，给这些孩子分发糖果：
        每个孩子至少分配到 1 个糖果。
        相邻两个孩子评分更高的孩子会获得更多的糖果。
        请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。
     * 
    */
    public int candy(int[] ratings) {

        int n = ratings.length;
        int[] left = new int[n];

        for(int i = 0;i<n;i++){
            if(i < n -1 && ratings[i] > ratings[i+1]){
                left[i] = left[i -1]+1;
            }else{
                left[i] = 1;
            }
        }
        int right = 0,ret = 0;


        


        


        return 0;

    }
}






