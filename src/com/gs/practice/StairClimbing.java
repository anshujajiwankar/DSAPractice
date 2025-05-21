package com.gs.practice;

public class StairClimbing {
    public int climbStairs(int n){
        if(n<=2) return n;

        int first =1, second =2,current =3;
        for(int i=3;i<=n; i++){
            current = first + second; // 3 = 1+2 // 3
            first=second;// 1=2 2
            second=current;//2=3 //
        }
        return current;
    }
    public static void main(String[] args) {
        StairClimbing sc = new StairClimbing();
        int n = 6; // Example input
        int ways = sc.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
