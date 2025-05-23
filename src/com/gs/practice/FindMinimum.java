package com.gs.practice;

public class FindMinimum {
    public static int findMin(int[] nums){
        int left = 0,right = nums.length -1;

        if(nums[left] <= nums[right]){
            return nums[left];
        }
        while (left < right){
            int mid = left + (right - left)/2;

            if(nums[mid] > nums[right]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args){
        int[] arr1 = {5,6,1,2,3,4};
        int[] arr2 ={1,2,3,4};

        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));

    }
}
