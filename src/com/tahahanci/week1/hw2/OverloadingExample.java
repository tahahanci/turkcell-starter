package com.tahahanci.week1.hw2;

public class OverloadingExample {

    public int sum(int x, int y) {
        return x + y;
    }

    public int sum(int...myArray) {
        int sum = 0;
        for (int i : myArray)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();
        System.out.println(overloadingExample.sum(6,5));
        System.out.println(overloadingExample.sum(new int[]{1, 2, 3}));
    }
}
