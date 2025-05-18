package com.gs.practice;

public class PalindromeCheckFromMiddle {
    public static boolean palindromeCheck(String input){
        if(input.length()<=1) return true;

        int length = input.length();
        int left = 0, right = length-1;
        int mid = (left+right) / 2;
        if(length % 2 ==0){
            left=mid;
            right=mid+1;

            while(input.charAt(left)==input.charAt(right)){
                left--;
                right++;
                if(left==-1 || right==input.length()){
                    return true;
                }
            }
        }else {
            left=mid-1;
            right=mid+1;
            while(input.charAt(left)==input.charAt(right)){
                left--;
                right++;
                if(left == -1 || right == input.length()){
                    return true;
                }
            }
        }
        return false;


    }
    public static void main(String[] args){
        String input = "qwertyytrewq";
        boolean result = PalindromeCheckFromMiddle.palindromeCheck(input);
        System.out.println("Given String is Palindrome ? " + result);
    }
}
