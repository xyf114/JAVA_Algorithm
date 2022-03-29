package com.NumMatrix;

public class Client {
    public static void main(String[] args) {
        int [][] matrix={{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(2,1,4,3));

        PreNumMatrix preNumMatrix = new PreNumMatrix(matrix);
        System.out.println(preNumMatrix.sumRegion(2,1,4,3));
    }
}
