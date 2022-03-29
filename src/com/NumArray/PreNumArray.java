package com.NumArray;

public class PreNumArray {
    private int [] preArray;

    public PreNumArray(int[] Array) {
        this.preArray = new int[Array.length+1];

        for (int i= 1; i<preArray.length; i++){
            this.preArray[i] = this.preArray[i-1] + Array[i-1];
        }
    }

    public int sumRange(int left, int right){
        return preArray[right+1] - preArray[left];
    }

}
