import java.util.List;

public class Solution559 {

    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }

        int maxChildDepth = 0;

        List<Node> children = root.children;
        for(Node child:children){
            maxChildDepth = Math.max(maxChildDepth, childDepth);
        }
        return maxChildDepth + 1;
    }

}






