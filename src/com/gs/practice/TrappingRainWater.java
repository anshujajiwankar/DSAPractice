package com.gs.practice;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingRainWater solver = new TrappingRainWater();
        int result = solver.trap(height);
        System.out.println("Trapped water: " + result);
    }

    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i]);
        }

        rmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(lmax[i], rmax[i]) - height[i];
        }

        return ans;
    }
}
