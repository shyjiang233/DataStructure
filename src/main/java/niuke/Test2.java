package niuke;

import java.math.BigDecimal;

public class Test2 {
    public static void main(String[] args) {
        float a=2.0f-1.9f;
        float b=1.8f-1.7f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
        BigDecimal a1= new BigDecimal("1.0");
        BigDecimal b1= new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        BigDecimal x = a1.subtract(b1);
        BigDecimal y = b1.subtract(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.compareTo(y));
    }
}
