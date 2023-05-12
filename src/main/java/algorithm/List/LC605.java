package algorithm.List;

public class LC605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 如果花种完了，或者花床检查完了，都停止遍历
        for (int i = 0, len = flowerbed.length; i < len && n > 0;) {
            if (flowerbed[i] == 1) {
                //即如果，当前i位置已经种植了话，那么下一个可以种花的位置是 i+2
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                //这里很关键
                //如果是最后一个位置了，那么肯定能够种植（i==flowerbed.length-1)
                //如果不是，则还需要确保 可种花的位置(i+2)紧邻其后的(i+2+1)的位置没有种植（flowerbed[i+1]==0)
                //只有这样才可以种植
                n--;
                //同时找出下一个可以种植的位置
                i += 2;
            } else {
                //这种情况是flowerbed[i+2+1]=1，所以下次循环就从这里重新开始判断其后可种植的位置
                i += 3;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 0}, 1));
    }
}
