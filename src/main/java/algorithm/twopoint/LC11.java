package algorithm.twopoint;

public class LC11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int res =0;
        while(left<right){
            int area = (right-left) * Math.min(height[left],height[right]);
            res = Math.max(res,area);
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
}
