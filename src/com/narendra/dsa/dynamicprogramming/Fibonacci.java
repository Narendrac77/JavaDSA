package com.narendra.dsa.dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {
        test4();
        test5();
        test6();
        test7();
        test1();
        test2();
        test3();
        // return the nth fibonacci value
        // 10 is  1 1 2 3 5 8 13 21 34 55
        test8();
        //traditional approach to print
        // 10 is  1 1 2 3 5 8 13 21 34 55
        test9();
        test10();
    }

    public static void test1() {
        int n = 6;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static void test2() {
        int n = 7;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }


    public static void test3() {
        int n = 8;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static void test4() {
        int n = 2;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static void test5() {
        int n = 3;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static void test6() {
        int n = 4;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static void test7() {
        int n = 5;
        System.out.println("Solution of " + n + " is ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void test8() {
        int n = 10;
        System.out.println("fibonacci of  n is " + fib2(n));
    }
     public static void test9() {
        int n = 10;
        System.out.println("fibonacci of  n is using traditional approach  ");
        fib3(n);
    }

    public static void test10() {
        int n = 10;
        System.out.println();
        System.out.println("fibonacci of  n is using traditional approach  ");
        fib4(n);
    }

    public static int fib2(int n) {
        if (n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void fib3(int n){
        int num1 = 0, num2 = 1;
        int counter = 0;
        while(counter < n){
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    public static void fib4(int n){
        int num1 = 1, num2 = 1;
        int counter = 0;
        while(counter < n){
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }
}

