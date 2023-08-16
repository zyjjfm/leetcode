import java.util.List;

import com.apple.laf.resources.aqua_pt_BR;

public class Solution501 {

    // 中序遍历二叉树

    /**
    给你一个含重复值的二叉搜索树（BST）的根节点 root ，
    找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
    如果树中有不止一个众数，可以按 任意顺序 返回。
    假定 BST 满足如下定义：

    结点左子树中所含节点的值小于等于当前节点的值
    结点右子树中所含节点的值大于等于当前节点的值
    左子树和右子树都是二叉搜索树

    */


    List<Integer> answer = new ArrayList<Integer>();
    int base,count,maxCount;

    public int[] findMode(TreeNode root) {

        dfs(root);
        int[] mode = new int[answer.size()];
        for(int i = 0;i<answer.size();i++){
            mode[i] = answer.get(i);
        }
        return mode;
    }

    public void dfs(TreeNode o){
        if( o == null){
            return;
        }
        dfs(o.left);
        update(o.val);
        dfs(o.right);

    }
    public void update(int x){
        if(x == base){
            ++count;
        }else{
            count = 1;
            base = x;
        }
        
        if(count == maxCount){
            answer.add(base);
        }

        if(count > maxCount){

            maxCount = count;
            answer.clear();
            answer.add(base);
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