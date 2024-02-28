package com.tahahanci.week1.hw2;

public class FindNumber {

    public void findNumber(int number, int[] myArray) {
        boolean flag = false;
        for (int j : myArray)
            if (j == number) {
                flag = true;
                break;
            }
        if (flag)
            System.out.println("Number founded.");
        else
            System.out.println("Number not founded.");
    }

    public static void main(String[] args) {
        FindNumber f1 = new FindNumber();
        int[] myArray = {1, 3, 5, 7, 9};
        f1.findNumber(3, myArray);
    }
}
