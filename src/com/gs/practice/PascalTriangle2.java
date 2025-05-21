package com.gs.practice;

import java.util.Arrays;

public class PascalTriangle2 {
    public static void main(String[] args){
        PascalTriangle2 pt2 = new PascalTriangle2();

        int rowNumber = 5;  // Get the 5th row (1-indexed)
        int[] row = pt2.pascalTriangleII(rowNumber);

        System.out.println("Pascal's Triangle Row " + rowNumber + ": " + Arrays.toString(row));
    }
        public int[] pascalTriangleII(int r) {
            int row[] = new int[r];
            for(int i=1;i<=r;i++) {
                int result = ncr(r-1, i-1);
                row[i-1] = result;
            }
            return row;
        }

        public int ncr(int n, int r) {
            int result = 1;
            for(int i=0;i<r;i++) {
                result = result * (n-i);
                result = result / (i+1);
            }
            return result;
        }
    }

