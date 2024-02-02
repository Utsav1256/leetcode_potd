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
        List<Integer> result = new ArrayList();

        for(int startingDigit = 1; startingDigit < 10; startingDigit++) {
            int number = startingDigit;

            if(number >= low && number <= high) {
                result.add(number);
            }

            for(int nextDigit = startingDigit + 1; nextDigit < 10; nextDigit++) {
                number = (number * 10) + nextDigit;

                if(number >= low && number <= high) {
                    result.add(number);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}