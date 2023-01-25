package com.nikitov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void shouldBe5() {
        var executor = new RemoveDuplicatesFromSortedArraySolution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = executor.removeDuplicates(nums);

        assertEquals(5, k);

        int[] expected = new int[]{0, 1, 2, 3, 4};
        int[] modifiedArray = new int[5];

        if (k >= 0) {
            System.arraycopy(nums, 0, modifiedArray, 0, k);
        }

        assertArrayEquals(expected, modifiedArray);
    }
}