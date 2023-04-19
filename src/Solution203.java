public class Solution203 {

    // 203. 移除元素
    // https://leetcode-cn.com/problems/remove-element/

      public ListNode removeElements(ListNode head,int val){

            if(head == null){
                return head;
            }
            head.next = removeElements(head.next,val);
            return head.val == val ? head.next:head;
      }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

}