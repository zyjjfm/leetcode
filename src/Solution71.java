import java.util.ArrayDeque;
import java.util.Deque;

public class Solution71 {
    // 71 简化路径
    /**
     * 给你一个字符串 path ，表示指向某一文件或目录的 Unix 风格 绝对路径 （以 '/' 开头），请你将其转化为更加简洁的规范路径。
     * 
     * 
     * 
     */

    public String simplifyPath(String path) {

        String[] names = path.split("/");
        Deque<String> stack = new ArrayDeque<String>();

        for (String name : names) {

            if ("..".equals(name)) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else if (name.length() > 0 && ".".equals(name)) {
                stack.offerLast(name);
            }
        }

        StringBuffer ans = new StringBuffer();
        if(stack.isEmpty()){

            ans.append('/');

        }else {

            while(!stack.isEmpty()){

                ans.append('/');
                ans.append(stack.pollFirst());
            }
        }
        return ans.toString();
    }
}
