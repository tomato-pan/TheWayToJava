package algorithm.List;

public class LC1945 {
    public static int getLucky(String s, int k) {
        int n = s.length(), res = 0;
        //s转化数字，同步执行一次按位求和，k-1
        for(int i = 0; i < n; ++i){
            int num = s.charAt(i) - 'a' + 1;
            while(num > 0){
                res += num % 10;
                num /= 10;
            }
        }
        --k;
        //循环k-1次按位求和
        while(k > 0){
            int tem = res;
            res = 0;
            while(tem > 0){
                res += tem % 10;
                tem /= 10;
            }
            --k;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 2));
    }
}
