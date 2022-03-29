package com.SubArraySum;

public class SubArraySum {
    private int [] subArray;
    private int k;

    public SubArraySum(int[] subArray, int k) {
        this.subArray = subArray;
        this.k = k;
    }

    public void show(){
        System.out.println(subArray);
        System.out.println(k);
    }
}
