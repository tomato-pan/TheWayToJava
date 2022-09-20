package fundamental.java_002;

import java.math.BigDecimal;

public class BasicDataType {
    int x = 1;
    short y = 2;
    byte a = 1;
    long z = 10000L;
    float f = 0.01f;
    double d = 12.6546787;
    boolean bb = true;
    char ch = 'a';

    public static void main(String[] args) {
        //byte
        System.out.println("Byte:"+Byte.SIZE);
        System.out.println("min:"+Byte.MIN_VALUE);
        System.out.println("max:"+Byte.MAX_VALUE);
        //short
        System.out.println("Short:"+Short.SIZE);
        System.out.println("min:"+Short.MIN_VALUE);
        System.out.println("max:"+Short.MAX_VALUE);
        //int
        System.out.println("Int:"+Integer.SIZE);
        System.out.println("min:"+Integer.MIN_VALUE);
        System.out.println("max:"+Integer.MAX_VALUE);
        //long
        System.out.println("Long:"+Long.SIZE);
        System.out.println("min:"+Long.MIN_VALUE);
        System.out.println("max:"+Long.MAX_VALUE);
        //float
        System.out.println("Float:"+Float.SIZE);
        System.out.println("min:"+Float.MIN_VALUE);
        System.out.println("max:"+Float.MAX_VALUE);
        //double
        System.out.println("Double:"+Double.SIZE);
        System.out.println("min:"+Double.MIN_VALUE);
        System.out.println("max:"+Double.MAX_VALUE);
        //问题
        System.out.println(4.0-3.6);
        BigDecimal a = BigDecimal.valueOf(4.0);
        BigDecimal b = BigDecimal.valueOf(3.6);
        System.out.println(a.subtract(b));

    }
}
