package com.pittacode.interviewprep.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum underTest = new TwoSum();

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = underTest.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

}