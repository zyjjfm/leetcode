public class Solution404 {
    // 404. 左叶子之和 
    // 给定二叉树的根节点 root ，返回所有左叶子之和
    public int sumOfLeftLeaves(TreeNode root) {
        
        return root != null ? dfs(root):0;
    }

        public int dfs(TreeNode node){
            int ans = 0;
            if(node.left != null){
                ans += isLeafNode(node.left) ? node.left.val:dfs(node.left);
            }
            if(node.right != null && !isLeafNode(node.right)){
                ans += dfs(node.right);
            }

            return ans;
        }

        public boolean isLeafNode(TreeNode node){
            return node.left == null && node.right == null;
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






