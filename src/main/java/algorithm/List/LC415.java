package algorithm.List;

public class LC415 {
    public static String addStrings(String num1, String num2) {
        int len1=num1.length(),len2=num2.length();
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int re = 0;
        while (len1>0||len2>0){
            len1--;
            len2--;
            int n1 = len1>=0?(ch1[len1]-'0'):0;
            int n2 = len2>=0?(ch2[len2]-'0'):0;
            int num = n1+n2+re;
            re = num/10;
            sb.append(num%10);
        }
        if (re>0){
            sb.append(re);
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String s = addStrings("11", "123");
        System.out.println(s);
    }
}
