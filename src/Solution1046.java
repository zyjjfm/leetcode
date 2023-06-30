import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import com.apple.concurrent.Dispatch.Priority;

public class Solution1046 {
    
    /**
    最后一块石头的重量
    */

    public int lastStoneWeight(int[] stones){

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
        
        for(int stone:stones){
            pq.offer(stone);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();

            if(a > b){
                pq.offer(a -b);
            }
        }
        return pq.isEmpty() ? 0:pq.poll();
    }
}
