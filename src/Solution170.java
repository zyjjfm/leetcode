import java.util.HashMap;
import java.util.Map;

public class Solution170 {

/**
170. 两数之和 III - 数据结构设计


设计一个接收整数流的数据结构，该数据结构支持检查是否存在两数之和等于特定值。

实现 TwoSum 类：

TwoSum() 使用空数组初始化 TwoSum 对象
void add(int number) 向数据结构添加一个数 number
boolean find(int value) 寻找数据结构中是否存在一对整数，使得两数之和与给定的值相等。如果存在，返回 true ；否则，返回 false 。

*/
private HashMap<Integer,Integer> num_counts;

public TwoSum() {
    this.num_counts = new HashMap<>();   
}

public void add(int number) {
    if(this.num_counts.containsKey(number)){
        this.num_counts.put(number,this.num_counts.get(number)+1);
    }else{
        this.num_counts.put(number,1);
    }
}

public boolean find(int value) {

    for(Map.Entry<Integer,Integer> entry:this.num_counts.entrySet()){

        int complement = value - entry.getKey();

        if(complement != entry.getKey()){
            if(this.num_counts.containsKey(entry.getKey())){

            }else{

            }

        }
    }

}
}
