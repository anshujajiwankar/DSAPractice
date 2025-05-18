package com.gs.practice;

public class SmallestMissingInteger {
    public static int findSmallestMissing(int[] arr){
        int low =0;
        int high = arr.length -2;

        while(low<= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == mid){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr1 ={1,2,3,4};
        System.out.println(findSmallestMissing(arr1));

        int[] arr2 ={0,1,3,4};
        System.out.println(findSmallestMissing(arr2));
    }
}
