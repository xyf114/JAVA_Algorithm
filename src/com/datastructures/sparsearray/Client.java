package com.datastructures.sparsearray;

public class Client {
    public static void main(String[] args) {
        SparesArray sparesArray = new SparesArray();
        sparesArray.setCol(11);
        sparesArray.setRow(11);
        sparesArray.newSpareArray();
        sparesArray.setSpareArray(1, 2, 1);
        sparesArray.setSpareArray(2, 3, 2);
        // sparesArray.show();
        // System.out.println(sparesArray.getSum());

        CompressArray compressArray = new CompressArray();
        compressArray.newCompressArray(sparesArray);
        // compressArray.show();
        // compressArray.saveToFile();
        // SparesArray test = compressArray.compressToSparesArray();
        // test.saveToFile();
    }
}
