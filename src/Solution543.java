public class Solution543 {

    //543. 二叉树的直径

    /*

    给你一棵二叉树的根节点,返回该树的直径 。
    二叉树的直径是指树中任意两个节点之间最长路径的长度 。
    这条路径可能经过也可能不经过根节点root 。
    两节点之间路径的长度由它们之间边数表示。

    */
      
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node){

        if(node == null){
            return 0;
        }

        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R)+1;
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
