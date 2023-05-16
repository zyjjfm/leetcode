import java.util.LinkedList;
import java.util.Queue;

public class Solution111 {
/*
给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

说明：叶子节点是指没有子节点的节点。
*/

public int minDepth(TreeNode root){

    int level = 0;
    if(root == null){
        return level;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        level++;
        //当前层的节点个数
        int size = queue.size();
        while(size -- > 0){
            TreeNode cur = queue.poll();
            if(cur.left == null && cur.right == null){
                return level;
            }
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }
    return -1;
}
    }

class TreeNode {
    int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
}
}
