package com.practice.exercises.lesson1;

public class Exercise1 {
    public static void main(String[] args) {
        char ch = 70;
        int n = ch + 50;
        long b = n + 1000L;
        byte t = (byte) (1 + b >> 2);
        short s = (short) (t / 8);
        double d = s * 3330.33;
        float f = (float) (d - 100f);
        boolean fl = (f > 0);
        String str = fl + "";
        System.out.println("The value of string is: " + str);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + "\n");

        isEven(101);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + "\n");

        convert(3);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + "\n");
    }

    private static void isEven(int n) {
        String res = "";
        if (n % 2 >= 0) {
            res = "n is even";
        }
        res = "n is odd";
        System.out.println(res);
    }

    private static void convert(int n) {
        String s = (n == 1) ? "one" : (n == 2) ? "two" : "three";
        System.out.println(s);
    }
}
