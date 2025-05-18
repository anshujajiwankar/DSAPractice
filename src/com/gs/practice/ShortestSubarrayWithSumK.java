package com.gs.practice;

import java.util.HashMap;

public class ShortestSubarrayWithSumK {

    public static int shortestSubarraySum(int[] arr, int K){
        HashMap<Integer,Integer> prefixMap = new HashMap<>();
        int minLength = Integer.MAX_VALUE;

        int sum = 0;

        prefixMap.put(0, -1);

        for(int i =0; i < arr.length; i++){
            sum += arr[i];

            if(prefixMap.containsKey(sum - K)){
                int preIndex = prefixMap.get(sum - K);
                int length = i - preIndex;
                minLength = Math.min(minLength, length);
            }
            if(!prefixMap.containsKey(sum)){
                prefixMap.put(sum, i);
            }
        }
        return (minLength == Integer.MAX_VALUE) ? -1: minLength;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 10, 2, 1};
        int K1 = 12;
        System.out.println(shortestSubarraySum(arr1, K1)); // Output: 2 (6 + 6)

        int[] arr2 = {5, 8, 50, 4};
        int K2 = 50;
        System.out.println(shortestSubarraySum(arr2, K2)); // Output: 1 (50)
    }
}



