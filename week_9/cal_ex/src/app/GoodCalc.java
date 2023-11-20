package app;

import lib.Calculator;

public class GoodCalc extends Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double average(int[] a) {
        int sum = 0;

        for (int i : a) {
            sum += i;
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(10, 20));
    }
}
