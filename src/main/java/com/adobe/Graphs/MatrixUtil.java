package com.adobe.Graphs;

import java.util.ArrayList;
import java.util.List;

public class MatrixUtil {
    public static int[][] createMatrix(int[] arr,int rowCount,int columnCount){
        int[][] matrix= new int[rowCount][columnCount];
        for(int i=0;i<rowCount;i++ ){
            //List<Integer> row= new ArrayList<>();
            for(int j=0;j<columnCount;j++){
                matrix[i][j]=arr[i*0+j];
            }
        }
        return matrix;
    }   

}
