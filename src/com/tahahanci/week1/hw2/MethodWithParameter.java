package com.tahahanci.week1.hw2;

public class MethodWithParameter {

    public int sum(int x, int y) {
        return x + y;
    }

    // Method overloading!
    public int sum(int...myArray) {
        int sum = 0;
        for (int j : myArray)
            sum += j;
        return sum;
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public void delete() {
        System.out.println("All folders are deleted!");
    }

    public static void main(String[] args) {
        MethodWithParameter methodWithParameter = new MethodWithParameter();
        methodWithParameter.delete();
        System.out.println(methodWithParameter.sum(9, 7));
    }
}
