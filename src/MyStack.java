import java.util.Queue;

public class MyStack {
    
    // 225. 用队列实现栈
    /**
     
    请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
    实现 MyStack 类：
    void push(int x) 将元素 x 压入栈顶。
    int pop() 移除并返回栈顶元素。
    int top() 返回栈顶元素。
    boolean empty() 如果栈是空的，返回 true ；否则，返回 false 

    */

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new Linklist<Integer>();
        queue2 = new Linklist<Integer>();
    }
    
    public void push(int x) {
        queue2.offer(x);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }
    
    public int pop() {
        return queue1.poll();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        queue1.isEmpty();
    }
}
