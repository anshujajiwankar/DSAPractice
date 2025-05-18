package com.gs.practice;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[]arr1, int[]arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[]merged = new int[m+n];
        int i =0, j =0, k =0;

        while(i<n && j<m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
            while (i < n) {
                merged[k++] = arr1[i++];
            }
            while (j < m) {
                merged[k++] = arr2[j++];
            }
            int totalLenght = n + m;
            if (totalLenght % 2 == 0) {
                int mid1 = totalLenght / 2;
                int mid2 = mid1 - 1;
                return (merged[mid1] + merged[mid2]) / 2.0;

            } else {
                return merged[totalLenght / 2];
            }
        }
        public static void main(String[] args){
            int[] arr1 ={2,3,5,8};
            int[] arr2 ={10,12,14,16,18,20};

            double median = findMedianSortedArrays(arr1,arr2);
            System.out.println("The median is: " + median);

        }
    }

