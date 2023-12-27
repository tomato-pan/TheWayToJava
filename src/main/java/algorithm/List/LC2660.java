package algorithm.List;

public class LC2660 {
    public static int isWinner(int[] player1, int[] player2) {
        int sum1 = calculateScore(player1);
        int sum2 = calculateScore(player2);
        return sum1 > sum2 ? 1 : sum2 > sum1 ? 2 : 0;
    }

    public static int calculateScore(int[] player) {
        int sum = 0; // 前两轮获得10分
        for (int i = 0; i < player.length; i++) {
            int k = (i > 0 && player[i - 1] == 10) || (i > 1 && player[i - 2] == 10) ? 2 : 1;
            sum += k * player[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isWinner(new int[]{4, 10, 7, 9}, new int[]{6, 5, 2, 3}));
        System.out.println(isWinner(new int[]{3, 5, 7, 6}, new int[]{8, 10, 10, 2}));
        System.out.println(isWinner(new int[]{5, 6, 1, 10}, new int[]{5, 1, 10, 5}));
        System.out.println(isWinner(new int[]{9,7,10,7}, new int[]{10,2,4,10}));
    }
}
