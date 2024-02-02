/*
Date : 02/02/2024
Problem Link : https://leetcode.com/problems/sequential-digits/description/
Difficulty : Medium
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> Ans = new ArrayList<>();
        for (int start = 1; start < 10; start++) {
            int value = start;

            if(value >= low && value <= high) {
                Ans.add(value);
            }

            for(int current = start + 1; current < 10; current++) {
                value = value * 10;
                value = value + current;

                if(value >= low && value <= high) {
                    Ans.add(value);
                }
            }
        }
        Collections.sort(Ans);
        return Ans;
    }
}