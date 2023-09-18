import java.util.ArrayList;
import java.util.List;

public class Solution590 {


    // 590. N 叉树的后序遍历

    public List<Integer> postorder(Node root){

        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(Node root,List<Integer> res){
        if(root == null){
            return;
        }
        for(Node ch:root.children){
            hlper(ch,res);
        }
        res.add(root.val);
    }
    
   
}

class Node{
    public int val;

    public List<Node> children;

    public Node(){
 
    }
    public Node(int _val){
        val = _val;
    }

    public Node(int _val,List<Node> _children){
        val = _val;
        children = _children;
    }

}






