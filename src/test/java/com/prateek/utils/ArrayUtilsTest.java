package com.prateek.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    // findMax tests
    @Test
    @DisplayName("findMax - finds maximum in array")
    void findMax() {
        int[] arr = {6, 5, 9, 2, 4};
        assertEquals(9, ArrayUtils.findMax(arr));
    }

    @Test
    @DisplayName("findMax - single element")
    void findMaxSingleElement() {
        int[] arr = {42};
        assertEquals(42, ArrayUtils.findMax(arr));
    }

    @Test
    @DisplayName("findMax - all same elements")
    void findMaxAllSame() {
        int[] arr = {5, 5, 5, 5};
        assertEquals(5, ArrayUtils.findMax(arr));
    }

    @Test
    @DisplayName("findMax - negative numbers")
    void findMaxNegative() {
        int[] arr = {-5, -2, -8, -1};
        assertEquals(-1, ArrayUtils.findMax(arr));
    }

    @Test
    @DisplayName("findMax - null array throws exception")
    void findMaxNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(null));
    }

    @Test
    @DisplayName("findMax - empty array throws exception")
    void findMaxEmptyThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(new int[0]));
    }

    // findMin tests
    @Test
    @DisplayName("findMin - finds minimum in array")
    void findMin() {
        int[] arr = {6, 5, 9, 2, 4};
        assertEquals(2, ArrayUtils.findMin(arr));
    }

    @Test
    @DisplayName("findMin - single element")
    void findMinSingleElement() {
        int[] arr = {42};
        assertEquals(42, ArrayUtils.findMin(arr));
    }

    @Test
    @DisplayName("findMin - negative numbers")
    void findMinNegative() {
        int[] arr = {-5, -2, -8, -1};
        assertEquals(-8, ArrayUtils.findMin(arr));
    }

    @Test
    @DisplayName("findMin - null array throws exception")
    void findMinNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMin(null));
    }

    // findMissingElement tests
    @Test
    @DisplayName("findMissingElement - finds 6 missing from 1-7 sequence")
    void findMissingElement() {
        int[] arr = {1, 2, 3, 4, 5, 7};
        assertEquals(6, ArrayUtils.findMissingElement(arr));
    }

    @Test
    @DisplayName("findMissingElement - finds 3 missing from 1-4 sequence")
    void findMissingElement2() {
        int[] arr = {1, 2, 4};
        assertEquals(3, ArrayUtils.findMissingElement(arr));
    }

    @Test
    @DisplayName("findMissingElement - finds 1 missing from sequence")
    void findMissingElementFirst() {
        int[] arr = {2, 3, 4, 5};
        assertEquals(1, ArrayUtils.findMissingElement(arr));
    }

    // findElementAppearsOnce tests
    @Test
    @DisplayName("findElementAppearsOnce - finds unique element")
    void findElementAppearsOnce() {
        int[] arr = {3, 4, 5, 2, 4, 3, 5};
        assertEquals(2, ArrayUtils.findElementAppearsOnce(arr));
    }

    @Test
    @DisplayName("findElementAppearsOnce - single element array")
    void findElementAppearsOnceSingle() {
        int[] arr = {7};
        assertEquals(7, ArrayUtils.findElementAppearsOnce(arr));
    }

    @Test
    @DisplayName("findElementAppearsOnce - larger array")
    void findElementAppearsOnceLarger() {
        int[] arr = {1, 1, 2, 2, 3, 3, 99};
        assertEquals(99, ArrayUtils.findElementAppearsOnce(arr));
    }

    @Test
    @DisplayName("findElementAppearsOnce - null throws")
    void findElementAppearsOnceNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findElementAppearsOnce(null));
    }

    // longestConsecutiveSequence tests
    @Test
    @DisplayName("longestConsecutiveSequence - finds longest sequence")
    void longestConsecutive() {
        int[] arr = {3, 9, 1, 10, 4, 20, 2};
        assertEquals(4, ArrayUtils.longestConsecutiveSequence(arr));
    }

    @Test
    @DisplayName("longestConsecutiveSequence - single element")
    void longestConsecutiveSingle() {
        int[] arr = {5};
        assertEquals(1, ArrayUtils.longestConsecutiveSequence(arr));
    }

    @Test
    @DisplayName("longestConsecutiveSequence - no consecutive elements")
    void longestConsecutiveNoSequence() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(1, ArrayUtils.longestConsecutiveSequence(arr));
    }

    @Test
    @DisplayName("longestConsecutiveSequence - all consecutive")
    void longestConsecutiveAll() {
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(5, ArrayUtils.longestConsecutiveSequence(arr));
    }

    @Test
    @DisplayName("longestConsecutiveSequence - null returns 0")
    void longestConsecutiveNull() {
        assertEquals(0, ArrayUtils.longestConsecutiveSequence(null));
    }

    @Test
    @DisplayName("longestConsecutiveSequence - empty returns 0")
    void longestConsecutiveEmpty() {
        assertEquals(0, ArrayUtils.longestConsecutiveSequence(new int[0]));
    }

    // kthLargest tests
    @Test
    @DisplayName("kthLargest - finds 1st largest (max)")
    void kthLargestFirst() {
        int[] arr = {5, 4, 7, 9, 2, 1, 8, 3};
        assertEquals(9, ArrayUtils.kthLargest(arr, 1));
    }

    @Test
    @DisplayName("kthLargest - finds 3rd largest")
    void kthLargestThird() {
        int[] arr = {5, 4, 7, 9, 2, 1, 8, 3};
        assertEquals(7, ArrayUtils.kthLargest(arr, 3));
    }

    @Test
    @DisplayName("kthLargest - finds last (minimum)")
    void kthLargestLast() {
        int[] arr = {5, 4, 7, 9, 2, 1, 8, 3};
        assertEquals(1, ArrayUtils.kthLargest(arr, 8));
    }

    @Test
    @DisplayName("kthLargest - k=0 throws exception")
    void kthLargestZeroThrows() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.kthLargest(arr, 0));
    }

    @Test
    @DisplayName("kthLargest - k exceeds array length throws exception")
    void kthLargestExceedsLength() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.kthLargest(arr, 5));
    }

    // findCommonElements tests
    @Test
    @DisplayName("findCommonElements - finds common elements between two arrays")
    void findCommonElements() {
        int[] arr1 = {4, 3, 7, 9, 2, 4};
        int[] arr2 = {5, 1, 4, 8, 3};
        Set<Integer> expected = Set.of(3, 4);
        assertEquals(expected, ArrayUtils.findCommonElements(arr1, arr2));
    }

    @Test
    @DisplayName("findCommonElements - no common elements")
    void findCommonElementsNone() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        assertTrue(ArrayUtils.findCommonElements(arr1, arr2).isEmpty());
    }

    @Test
    @DisplayName("findCommonElements - all elements common")
    void findCommonElementsAll() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        Set<Integer> expected = Set.of(1, 2, 3);
        assertEquals(expected, ArrayUtils.findCommonElements(arr1, arr2));
    }

    // filterEven / filterOdd tests
    @Test
    @DisplayName("filterEven - filters even numbers")
    void filterEven() {
        int[] arr = {8, 5, 10, 12, 1, 3, 4};
        List<Integer> expected = List.of(8, 10, 12, 4);
        assertEquals(expected, ArrayUtils.filterEven(arr));
    }

    @Test
    @DisplayName("filterOdd - filters odd numbers")
    void filterOdd() {
        int[] arr = {8, 5, 10, 12, 1, 3, 4};
        List<Integer> expected = List.of(5, 1, 3);
        assertEquals(expected, ArrayUtils.filterOdd(arr));
    }

    @Test
    @DisplayName("filterEven - no even numbers returns empty")
    void filterEvenNone() {
        int[] arr = {1, 3, 5, 7};
        assertTrue(ArrayUtils.filterEven(arr).isEmpty());
    }

    @Test
    @DisplayName("filterOdd - no odd numbers returns empty")
    void filterOddNone() {
        int[] arr = {2, 4, 6, 8};
        assertTrue(ArrayUtils.filterOdd(arr).isEmpty());
    }
}
