package com.NumArray;

public class Client {
    public static void main(String[] args) {
        int [] test ={1,2,3,4};
        NumArray array = new NumArray(test);
        System.out.println(array.sumArray(2,3));

        PreNumArray preNumArray = new PreNumArray(test);
        System.out.println(preNumArray.sumRange(2,3));
    }
}
