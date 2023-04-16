import java.util.ArrayList;
import java.util.List;

public class Solution234 {
    
    // 234. 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。
    // 如果是，返回 true ；否则，返回 false 。

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        
        //将链表转成数组
        ListNode currentNode = head;
        while(currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //使用双指针判断是否回文
        int front = 0;
        int back = vals.size() - 1;
        while(front < back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front ++;
            back --;
        }
        return true;
    }
}

