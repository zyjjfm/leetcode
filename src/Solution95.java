import java.util.LinkedList;
import java.util.List;

public class Solution95 {
    // 95. 不同的二叉搜索树 II
    /**
     * 给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同 二叉搜索树 。
     * 可以按 任意顺序 返回答案。
    */

    public List<TreeNode> generateTrees(int n){

        if(n == 0){
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int start,int end){
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if(start > end){
            allTrees.add(null);
            return allTrees;
        }

        for(int i = start;i <= end;i++){
            //获取所有可行的左子树集合
            List<TreeNode> leftTrees = generateTrees(start,i -1); 
            //获取所有可行的右子树集合
            List<TreeNode> righTrees = generateTrees(i + 1,end);
            //从左子树结婚中选出一颗左子树，从右子树集合中选出一颗右子树，拼接到根节点上
            for(TreeNode left:leftTrees){
                for(TreeNode right:righTrees){
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left;
                    currTree.right = right;
                    allTrees.add(currTree);
                }
            }
        }
        return allTrees;
    }
}
