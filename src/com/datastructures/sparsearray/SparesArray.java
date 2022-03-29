package com.datastructures.sparsearray;

import java.io.FileWriter;
import java.io.IOException;

public class SparesArray implements Array{
    private int row;
    private int col;
    private int sum;
    private int[][] sparearray;

    public void setRow(int row){
        this.row = row;
    }
    public void setCol(int col){
        this.col = col;
    }

    @Override
    public int getRow(){
        return this.row;
    }

    @Override
    public int getCol(){
        return this.col;
    }

    public void newSpareArray() {
        this.sparearray = new int[row][col];
    } 

    public void setSpareArray(int row, int col, int number) {
        this.sparearray[row][col] = number;
        this.sum++;
    }

    public int getSum(){
        return this.sum;
    }

    public boolean hasNumber(int row, int col){
        if(this.sparearray[row][col] != 0)
            return true;
        return false;
    }

    public int getNumber(int row, int col){
        return this.sparearray[row][col];
    }

    @Override
    public void saveToFile(){
        FileWriter fos = null;
        String path = "/Users/xyfffx/Documents/java-learn/java_basic_learn/src/datastructures/sparsearray/sparseArray.txt";
        try {
            fos = new FileWriter(path);
            for (int[] is : this.sparearray) {
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
    public void show(){
        for (int[] is : this.sparearray) {
            for (int i : is) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }
}
