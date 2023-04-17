import java.util.LinkedList;
import java.util.Queue;

public class Solution112 {
    
    // 112. 路径总和
    // 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，
    // 这条路径上所有节点值相加等于目标和 targetSum 。如果存在，返回 true ；否则，返回 false 。
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (){}
        TreeNode (int val){this.val = val;}
        TreeNode (int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    
    public boolean hasPathSum(TreeNode root,int sum) {

        if(root == null){
            return false;
        }

        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
        Queue<Integer> queVal = new LinkedList<Integer>();
        queNode.offer(root);
        queVal.offer(root.val);

        while(!queNode.isEmpty()){

            TreeNode now = queNode.poll();
            int temp = queVal.poll();

            if(now.left == null && now.right == null){

                if(temp == sum){
                    return true;
                }
                continue;
            }
            if(now.left != null){
                queNode.offer(now.left);
                queVal.offer(now.left.val + temp);
            }

            if(now.right != null){
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }
}
