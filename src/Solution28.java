public class Solution28 {
    
    public int strStr(String ss, String pp){

        int n =ss.length(), m = pp.length();
        char[] s= ss.toCharArray(), p = pp.toCharArray();

        for(int i =0;i<= n -1;i++){
            int a =i,b = 0;
            while(b < m && s[a] == p[b]){
                a++;
                b++;
            }
               if(b == m) return i;
        }
    return -1;
    }
}






