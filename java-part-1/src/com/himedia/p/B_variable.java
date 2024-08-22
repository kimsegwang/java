package com.himedia.p;

public class B_variable {
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int minus(int a, int b){
        int minuse = a - b;
        return minuse;
    }
    public static int multiply(int a, int b){
        int multiply = a * b;
        return multiply;
    }
    public static double divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println(result);

        int a=10;
        int b=3;

        result = minus(a,b);
        System.out.println(result);
        result = multiply(a,b);
        System.out.println(result);
        double dResult = divide(a,b);
        System.out.println(dResult);
    }
}
