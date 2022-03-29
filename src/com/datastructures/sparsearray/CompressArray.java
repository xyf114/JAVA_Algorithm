package com.datastructures.sparsearray;

import java.io.FileWriter;
import java.io.IOException;

public class CompressArray implements Array{
    private int row;
    private int col;
    private int[][] compressArray;

    public void newCompressArray(SparesArray sparesArray) {
        this.row = sparesArray.getSum();
        this.col = 3;
        this.compressArray = new int[row+1][col];
        this.compressArray[0][0] = sparesArray.getRow();
        this.compressArray[0][1] = sparesArray.getCol();
        this.compressArray[0][2] = sparesArray.getSum();
        int count = 1;
        for(int i = 0; i< sparesArray.getRow(); i++){
            for(int j = 0; j< sparesArray.getCol(); j++){
                if(sparesArray.hasNumber(i, j)){
                    this.compressArray[count][0] = i;
                    this.compressArray[count][1] = j;
                    this.compressArray[count][2] = sparesArray.getNumber(i, j);
                    count++;
                }
            }
        }          
    }

    public SparesArray compressToSparesArray() {
        if(compressArray == null){
            throw new RuntimeException();
        }
        SparesArray temp = new SparesArray();
        temp.setCol(this.compressArray[0][1]);
        temp.setRow(this.compressArray[0][0]);
        temp.newSpareArray();
        for(int i =1; i<this.compressArray.length; i++){
            temp.setSpareArray(this.compressArray[i][0], this.compressArray[i][1], this.compressArray[i][2]);
        }
        return temp;
    }
    
    @Override
    public void saveToFile(){
        FileWriter fos = null;
        String path = "/Users/xyfffx/Documents/java-learn/java_basic_learn/src/datastructures/sparsearray/compressArray.txt";
        try {
            fos = new FileWriter(path);
            for (int[] is : this.compressArray) {
                for (int i : is) {
                    fos.write(i + "\t");
                }
                fos.write("\n");
            }
        } catch (IOException e) {
            //TODO: handle exception
        } finally{
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public void show() {
        for (int[] is : this.compressArray) {
            for (int i : is) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }
    
}
