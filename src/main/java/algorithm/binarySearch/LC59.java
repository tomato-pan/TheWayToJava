package algorithm.binarySearch;

/**
 * @Author: tomato
 * @CreateTime: 2024-04-01  19:53
 * @Description: TODO
 * @Version: 1.0
 */
public class LC59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int l = 0, r = n - 1, up = 0, down = n - 1;
        int num = 1;
        for (int i = 0; i < n * n; i++) {
            for (int j = l; j <= r; j++) {
                res[up][j] = num++; // left to right
            }
            up++;
            for (int j = up; j <= down; j++) {
                res[j][r] = num++; // top to bottom
            }
            r--;
            for (int j = r; j >= l; j--) {
                res[down][j] = num++; // right to left
            }
            down--;
            for (int j = down; j >= up; j--) {
                res[j][l] = num++; // bottom to top
            }
            l++;
        }
        return res;
    }
}
