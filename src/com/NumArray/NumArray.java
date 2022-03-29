package com.NumArray;

public class NumArray {
    private int [] array;

    public NumArray(int[] array) {
        this.array = array;
    }


    public int sumArray(int left, int right){
        int sum = 0;
        for (int i = left; i<=right; i++){
            sum += this.array[i];
        }
        return sum;
    }

}
