package com.tahahanci.week1.hw2;

import java.util.Arrays;

public class StackAndHeapVariables {

    public static void main(String[] args) {
        int[] myFirst = new int[]{1, 3, 5};
        int[] mySecond = new int[]{1, 3, 9};

        System.out.println("myFirst Array: " + Arrays.toString(myFirst));
        System.out.println("mySecond Array: " + Arrays.toString(mySecond));

        System.out.println();
        System.out.println("After the change!");
        mySecond = myFirst;
        mySecond[0] = 85;
        System.out.println("myFirst Array: " + Arrays.toString(myFirst));
        System.out.println("mySecond Array: " + Arrays.toString(mySecond));
    }
}
