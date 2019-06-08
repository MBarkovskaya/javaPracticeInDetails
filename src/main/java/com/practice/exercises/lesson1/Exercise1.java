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

        convert(1);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + "\n");

        System.out.println(sum(-2, 2));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + "\n");

//        System.out.println(sum2(2, 2));
    }

    private static void isEven(int n) {
        String res;
        if (n % 2 == 0) {
            res = "n is even";
        } else {
            res = "n is odd";
        }
        System.out.println(res);
    }

    private static void convert(int n) {
        String s = (n == 1) ? "one" : (n == 2) ? "two" : "three";
        System.out.println(s);
    }

    private static int sum(int a, int b) {
        int sum = 0;
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b less than zero");

        }
        while (sum < a) {
            sum++;
        }
        int counter = 0;
        while (counter < b) {
            counter++;
            sum++;
        }
        return sum;
    }

    private static int sum2(int a, int b) {
        int sum = 0;
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a or b less than zero");

        }
        sum = sum(a, b, 0, 0);
        return sum;
    }

    private static int sum(int a, int b, int x, int cnt) {
        if (x < a) {
            x += 1;
            sum(a, b, x, cnt);
        } else if (cnt < b) {
            cnt++;
            x += 1;
            sum(a, b, x, cnt);
        }

        return x;
    }

}
