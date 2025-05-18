package com.gs.practice;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        if(s.length() == 1) return s;

        String LPS = "";
        for(int i=1; i<s.length();i++) {
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == s.length()) {
                    break;
                }
            }
            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() >= LPS.length()) {
                LPS = palindrome;
            }
            low = i - 1;
            high = i;

            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;

                if (low == -1 || high == s.length()) {
                    break;
                }
            }
             palindrome = s.substring(low + 1, high);
            if (palindrome.length() >= LPS.length()) {
                LPS = palindrome;
            }
        }
        return LPS;

    }
    public static void main(String[] args) {
	String input = "forgeeksskeegrof";
       // String input = "baada";
       // String result = findLongestPalindrome(input);
        System.out.println("Longest Palindrome: " + input);
        System.out.println("Length: " + input.length());
    }
}



