public class Solution257 {
     // 257. 二叉树的所有路径
    /**
     * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。 
     * 叶子节点 是指没有子节点的节点。
    */
    public void constructPaths(TreeNode root,String path,List<String> paths){

        if(root != null){
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));

            if(root.left == null && root.right == null){
                paths.add(pathSB.toString());
            }else{
                pathSB.append("->");
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);

            }
        }
    }    
}
