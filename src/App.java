// 代码注释
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World LeetCode!");
        int[] nums = {3,4,5,1,2};

        // 写一个for循环，打印前100之内的质数  质数：只能被1和自身整除的数
        // 1.定义一个变量，用来记录质数的个数
        int count = 0;
        // 2.定义一个变量，用来记录当前的数
        int num = 2;
        // 3.定义一个变量，用来记录当前的数是否是质数
        boolean flag = true;
        // 4.循环判断
        while(count < 100){
            // 4.1 判断当前的数是否是质数
            for(int i = 2;i < num;i++){
                if(num % i == 0){
                    flag = false;
                    break;
                }
            }
            // 4.2 如果是质数，打印出来，并且质数的个数加1
            if(flag){
                System.out.println(num);
                count++;
            }
            // 4.3 当前的数加1
            num++;
            // 4.4 重置flag
            flag = true;
        }




        
        
    }
}
