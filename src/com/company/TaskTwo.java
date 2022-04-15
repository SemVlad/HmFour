package com.company;

public class TaskTwo {
    public static void main(String[] args) {

        // Преобразования без потери точности
        // Примеры простые, надеюсь такие подойдут)

        //  byte -> short -> int -> long
        byte b = 21;
        short s;
        s = (short) (b * 15);
        System.out.println(s);

        int i;
        i = s * 9_185;
        System.out.println(i);

        long l;
        l = i * 34_379L;
        System.out.println(l);

        // char -> int
        char c = 'f'; // в таблице unicode f = 102
        int a;
        a = c * 10;
        System.out.println(a);

        // int -> double
        int t = 10;
        double d = t * 3.5;
        System.out.println(d);

        // short -> float -> double
        short w = 13;
        float q = w + 1.5f;
        System.out.println(q);

        double g = q + 14.2;
        System.out.println(g);

    }
}
