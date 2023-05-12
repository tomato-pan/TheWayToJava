package algorithm.List;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // findMax
        List<Boolean> res = new ArrayList<>();
        int max = -1;
        for (int candy : candies) {
            if (candy>max){
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy+extraCandies>max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;

    }
}
