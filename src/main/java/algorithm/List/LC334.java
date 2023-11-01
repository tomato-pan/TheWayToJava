package algorithm.List;

public class LC334 {

    public  static boolean increasingTriplet(int[] nums) {
        int one = Integer.MAX_VALUE,two = Integer.MAX_VALUE;
        for(int three : nums){
            if(three > two) return true;
            else if(three <= one) one = three;
            else two = three;
            // if(three > one && three < two) two = three;
        }
        return false;
    }
}
