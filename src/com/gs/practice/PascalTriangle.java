package com.gs.practice;

public class PascalTriangle {

    public static void main(String[] args){
        PascalTriangle pt = new PascalTriangle();

        int row = 5;
        int col = 3;

        int result = pt.pascalTriangle(row, col);
        System.out.println("Value at row " + row + ", column " + col + " in Pascal's Triangle: " + result);

    }
    public int pascalTriangle(int r, int c){
        int result = ncr(r-1, c-1);
        return result;
    }
    public int ncr(int n, int r){
        int result =1;
        for(int i=0;i<r;i++){
            result = result*(n-1);
            result = result/ (i+1);
        }
        return result;
    }
}
