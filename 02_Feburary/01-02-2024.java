/*
Date : 01/02/2024
Problem : Divide Array Into Arrays With Max Difference
Difficulty : Medium
Problem Link : https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/

*/

import java.util.Arrays;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int[][] ans = new int[n / 3][3];

        int index = 0;

        for(int i =0; i < n; i += 3) {
            if(i + 2 < n && nums[i + 2] - nums[i] > k) {
                return new int[0][0];
            }

            ans[index++] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
        }
        return ans;
    }
}