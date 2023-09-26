package algorithm.List;

public class LC2582 {
    public static int passThePillow(int n, int time) {
        int floor = time % (n-1);
        int count = time / (n-1);
        if ((count & 1) != 0) {
            //余数为基数
            return n - floor;
        } else {
            return floor+1;
        }
    }

    public static void main(String[] args) {
        System.out.println(passThePillow(4, 5));
        System.out.println(passThePillow(3, 2));
        System.out.println(passThePillow(5, 10));
    }
}
