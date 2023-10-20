package algorithm.List;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC901 {

    class StockSpanner {
        private Deque<int[]> stk = new ArrayDeque<>();

        public StockSpanner() {
        }

        public int next(int price) {
            int cnt = 1;
            while (!stk.isEmpty() && stk.peek()[0] <= price) {
                cnt += stk.pop()[1];
            }
            stk.push(new int[] {price, cnt});
            return cnt;
        }

    }

    public static void main(String[] args) {
        int [] stocks = new int[]{100,80,60,70,60,75,85};
        //当日股票价格的 跨度 被定义为股票价格小于或等于今天价格的最大连续日数
        int [] res = new int[]{1,1,1,2,1,4,6};
    }
}
