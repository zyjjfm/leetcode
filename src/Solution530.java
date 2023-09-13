public class Solution530 {

   int pre;
   int ans;

    // 530. 二叉搜索树的最小绝对差
      public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root){
      if( root == null){
        return;
      }
      dfs(root.left);
      if(pre == -1){
        pre = root.val;
      }else{
        ans = Math.min(ans, root.val - pre);
        pre = root.val;
      }
      dfs(root.right);
    }
}
