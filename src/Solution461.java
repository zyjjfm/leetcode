public class Solution461 {
    // 461. 汉明距离 
    /**
     
    两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
    给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
    
    */
    public int hammingDistance(int x, int y) {

         int s = x ^ y;
         int ret = 0;
         while(s != 0){
            ret += s & 1;
            s >>= 1;
         }
        return ret;
    }
}