package algorithm.DP;

public class LCP06 {
    public static int minCount(int[] coins) {
        int count = 0;
        //贪心
        for (int coin : coins) {
            int floor = coin%2;
            count += coin/2+floor;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minCount(new int[]{4, 2, 1}));
    }
}
