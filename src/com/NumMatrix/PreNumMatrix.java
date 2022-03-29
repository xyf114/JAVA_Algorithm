package com.NumMatrix;

public class PreNumMatrix {
    private  int [][] preNumMatrix;

    public PreNumMatrix(int[][] NumMatrix) {
        int row = NumMatrix.length;
        int col = NumMatrix[0].length;
        if ( row == 0 || col == 0)
            throw new RuntimeException("无效矩阵");
        preNumMatrix = new int[row+1][col+1];

        for (int i = 1; i<=row ; i++){
            for (int j = 1; j<=col ; j++){
                preNumMatrix[i][j] = NumMatrix[i-1][j-1] + preNumMatrix[i-1][j] + preNumMatrix[i][j-1] - preNumMatrix[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2){
        return preNumMatrix[row2+1][col2+1] - preNumMatrix[row1][col2+1] - preNumMatrix[row2+1][col1] + preNumMatrix[row1][col1];
    }
}
