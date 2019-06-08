package com.practice.exercises.lesson1;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2019) + " 2019");
        System.out.println(isLeapYear(2020) + " 2020");
        System.out.println(isLeapYear(2021) + " 2021");
        System.out.println(isLeapYear(2400) + " 2400");
        System.out.println(isLeapYear(1100) + " 1100");

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Absolute value of n is:" + abs(-2));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(max_v1(-1, 3, 1, 0));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(max_v2(-2, 0, 0, 0));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(reverse("asdf"));
    }

    // 2000-3000
    private static boolean isLeapYear(int y) {
        return y % 400 == 0 || y % 100 != 0 && y % 4 == 0;
    }

    private static int abs(int n) {
        return (n < 0) ? -n : n;
    }

    private static int max_v1(int n1, int n2, int n3, int n4) {
        int max = 0;
        if (n1 > n2) {
            if (n3 > n4) {
                if (n1 > n3) {
                    max = n1;
                } else max = n3;
            } else {
                if (n1 > n4) {
                    max = n1;
                } else max = n4;
            }
        } else {
            if (n3 > n4) {
                if (n2 > n3) {
                    max = n2;
                } else max = n3;
            } else {
                if (n2 > n4) {
                    max = n2;
                } else max = n4;
            }
        }

        return max;
    }

    private static int max_v2(int n1, int n2, int n3, int n4) {
        int max = 0;
        if (n1 > n2) {
            max = n1;
        } else {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }
        return max;
    }

    private static String reverse(String s) {
        String res = "";
        int i = s.length() - 1;
        while (i >= 0) {
            res += String.valueOf(s.charAt(i--));
        }
        return res;
    }
}
