package algorithm.List;

public class LC2525 {

    /**
     * 如果满足以下条件，那么箱子是 "Bulky" 的：
     * 箱子 至少有一个 维度大于等于 10^4 。
     * 或者箱子的 体积 大于等于 10^9 。
     * 如果箱子的质量大于等于 100 ，那么箱子是 "Heavy" 的。
     * 如果箱子同时是 "Bulky" 和 "Heavy" ，那么返回类别为 "Both" 。
     * 如果箱子既不是 "Bulky" ，也不是 "Heavy" ，那么返回类别为 "Neither" 。
     * 如果箱子是 "Bulky" 但不是 "Heavy" ，那么返回类别为 "Bulky" 。
     * 如果箱子是 "Heavy" 但不是 "Bulky" ，那么返回类别为 "Heavy" 。
     *
     * @param length
     * @param width
     * @param height
     * @param mass
     * @return
     */
    public static String categorizeBox(int length, int width, int height, int mass) {
        String key = "";
        long muti = (long) length * width * height;
        if (width >= 10000 || height >= 10000 || length >= 10000 || muti >= 1000000000L) {
            key = "Bulky";
        }
        if (mass > 100) {
            if (key.equals("")) {
                key = "Heavy";
            } else if (key.equals("Bulky")) {
                key = "Both";
            }
        } else {
            if (key.equals("")) {
                key = "Neither";
            }
        }
        return key;
    }

    public static void main(String[] args) {
        System.out.println(categorizeBox(2909, 3968, 3272, 727));
        System.out.println(categorizeBox(10000, 1, 1, 1));
    }
}
