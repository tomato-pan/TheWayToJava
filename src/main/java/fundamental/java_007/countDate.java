package fundamental.java_007;

import java.util.HashMap;

public class countDate {
    public int dayOfYear(String date) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() {
            {
                put(1,31);
                put(2,28);
                put(3,31);
                put(4,30);
                put(5,31);
                put(6,30);
                put(7,31);
                put(8,31);
                put(9,30);
                put(10,31);
                put(11,30);
                put(12,31);
            }

        };
        String[] date1 = date.split("-");
        int year = Integer.parseInt(date1[0]);
        int day = Integer.parseInt(date1[2]);
        int month = Integer.parseInt(date1[1]);
        if (year % 4 == 0) {
            map.put(2, 29);
        }
        int res = 0;
        for (int i = 1; i < month ; i++) {
            res = map.get(i) + res;
        }
        return res + day;
    }
    public int dayOfYear1(String date) {
        int[] monthList = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] date1 = date.split("-");
        int year = Integer.parseInt(date1[0]);
        int day = Integer.parseInt(date1[2]);
        int month = Integer.parseInt(date1[1]);
        if (year % 4 == 0) {
            monthList[1]=29;
        }
        int res = 0;
        for (int i =0; i < month-1 ; i++) {
            res = monthList[i] + res;
        }
        return res + day;
    }

    public static void main(String[] args) {
        countDate cd = new countDate();
        System.out.println(cd.dayOfYear("2019-01-09"));
        System.out.println(cd.dayOfYear("2019-02-10"));
        System.out.println(cd.dayOfYear("2004-03-01"));
        System.out.println(cd.dayOfYear1("2004-03-01"));
        System.out.println(cd.dayOfYear1("2019-02-10"));
    }
}
