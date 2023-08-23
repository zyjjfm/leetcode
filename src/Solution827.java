import java.util.ArrayList;
import java.util.List;

public class Solution827 {
    /**
     * 
     * 872. 叶子相似的树
     * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。  
       举个例子，如上图所示，给定一棵叶值序列为 (6, 7, 4, 9, 8) 的树。
       如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
       如果给定的两个根结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。

     * 
     */

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> seq1 = new ArrayList<Integer>();
        if(root1 != null){
            dfs(root1, seq1);
        }
        List<Integer> seq2 = new ArrayList<Integer>();
        if(root2 != null){
            dfs(root2, seq2);
        }
        return seq2.equals(seq1);
    }

    public void dfs(TreeNode node,List<Integer> seq){
        if(node.left == null && node.right == null){
            seq.add(node.val);
        }else {
            if(node.left != null){
                dfs(node.left, seq);
            }
            if(node.right != null){
                dfs(node.right, seq);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
