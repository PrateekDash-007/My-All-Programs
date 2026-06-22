package com.prateek.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {

    @Test
    @DisplayName("BubbleSort - sorts an unsorted array")
    void bubbleSortUnsorted() {
        int[] input = {36, 19, 29, 12, 5};
        int[] expected = {5, 12, 19, 29, 36};
        assertArrayEquals(expected, SortingAlgorithms.bubbleSort(input));
    }

    @Test
    @DisplayName("BubbleSort - already sorted array remains unchanged")
    void bubbleSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingAlgorithms.bubbleSort(input));
    }

    @Test
    @DisplayName("BubbleSort - reverse sorted array")
    void bubbleSortReverseSorted() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingAlgorithms.bubbleSort(input));
    }

    @Test
    @DisplayName("BubbleSort - single element array")
    void bubbleSortSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, SortingAlgorithms.bubbleSort(input));
    }

    @Test
    @DisplayName("BubbleSort - array with duplicates")
    void bubbleSortDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected = {1, 1, 2, 3, 4, 5, 5, 6, 9};
        assertArrayEquals(expected, SortingAlgorithms.bubbleSort(input));
    }

    @Test
    @DisplayName("BubbleSort - does not modify original array")
    void bubbleSortDoesNotModifyOriginal() {
        int[] input = {3, 1, 2};
        int[] original = input.clone();
        SortingAlgorithms.bubbleSort(input);
        assertArrayEquals(original, input);
    }

    @Test
    @DisplayName("InsertionSort - sorts an unsorted array")
    void insertionSortUnsorted() {
        int[] input = {3, 4, 2, 7, 1, 5, 10};
        int[] expected = {1, 2, 3, 4, 5, 7, 10};
        assertArrayEquals(expected, SortingAlgorithms.insertionSort(input));
    }

    @Test
    @DisplayName("InsertionSort - already sorted array")
    void insertionSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingAlgorithms.insertionSort(input));
    }

    @Test
    @DisplayName("InsertionSort - reverse sorted array")
    void insertionSortReverseSorted() {
        int[] input = {10, 8, 6, 4, 2};
        int[] expected = {2, 4, 6, 8, 10};
        assertArrayEquals(expected, SortingAlgorithms.insertionSort(input));
    }

    @Test
    @DisplayName("InsertionSort - array with negative numbers")
    void insertionSortNegativeNumbers() {
        int[] input = {-3, 5, -1, 0, 2};
        int[] expected = {-3, -1, 0, 2, 5};
        assertArrayEquals(expected, SortingAlgorithms.insertionSort(input));
    }

    @Test
    @DisplayName("SelectionSort - sorts an unsorted array")
    void selectionSortUnsorted() {
        int[] input = {38, 52, 9, 18, 6, 62, 13};
        int[] expected = {6, 9, 13, 18, 38, 52, 62};
        assertArrayEquals(expected, SortingAlgorithms.selectionSort(input));
    }

    @Test
    @DisplayName("SelectionSort - already sorted array")
    void selectionSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingAlgorithms.selectionSort(input));
    }

    @Test
    @DisplayName("SelectionSort - array with all same elements")
    void selectionSortAllSame() {
        int[] input = {7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7};
        assertArrayEquals(expected, SortingAlgorithms.selectionSort(input));
    }

    @Test
    @DisplayName("QuickSort - sorts an unsorted array")
    void quickSortUnsorted() {
        int[] input = {6, 3, 9, 5, 2, 8};
        int[] expected = {2, 3, 5, 6, 8, 9};
        assertArrayEquals(expected, SortingAlgorithms.quickSort(input));
    }

    @Test
    @DisplayName("QuickSort - already sorted array")
    void quickSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingAlgorithms.quickSort(input));
    }

    @Test
    @DisplayName("QuickSort - reverse sorted array")
    void quickSortReverseSorted() {
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        assertArrayEquals(expected, SortingAlgorithms.quickSort(input));
    }

    @Test
    @DisplayName("QuickSort - array with duplicates")
    void quickSortDuplicates() {
        int[] input = {5, 3, 5, 1, 3};
        int[] expected = {1, 3, 3, 5, 5};
        assertArrayEquals(expected, SortingAlgorithms.quickSort(input));
    }

    @Test
    @DisplayName("QuickSort - single element")
    void quickSortSingleElement() {
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, SortingAlgorithms.quickSort(input));
    }

    @Test
    @DisplayName("MergeSort - sorts an unsorted array")
    void mergeSortUnsorted() {
        int[] input = {6, 3, 9, 5, 2, 8};
        int[] expected = {2, 3, 5, 6, 8, 9};
        assertArrayEquals(expected, SortingAlgorithms.mergeSort(input));
    }

    @Test
    @DisplayName("MergeSort - already sorted array")
    void mergeSortAlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingAlgorithms.mergeSort(input));
    }

    @Test
    @DisplayName("MergeSort - reverse sorted array")
    void mergeSortReverseSorted() {
        int[] input = {10, 8, 6, 4, 2};
        int[] expected = {2, 4, 6, 8, 10};
        assertArrayEquals(expected, SortingAlgorithms.mergeSort(input));
    }

    @Test
    @DisplayName("MergeSort - large array")
    void mergeSortLargeArray() {
        int[] input = {15, 9, 7, 13, 12, 16, 14, 18, 11};
        int[] expected = {7, 9, 11, 12, 13, 14, 15, 16, 18};
        assertArrayEquals(expected, SortingAlgorithms.mergeSort(input));
    }

    @Test
    @DisplayName("MergeSort - array with negative numbers")
    void mergeSortNegativeNumbers() {
        int[] input = {-5, 3, -2, 0, 7, -1};
        int[] expected = {-5, -2, -1, 0, 3, 7};
        assertArrayEquals(expected, SortingAlgorithms.mergeSort(input));
    }

    @Test
    @DisplayName("All sorts produce same result for random array")
    void allSortsProduceSameResult() {
        int[] input = {42, 17, 93, 8, 55, 31, 72, 4};
        int[] bubbleResult = SortingAlgorithms.bubbleSort(input);
        int[] insertionResult = SortingAlgorithms.insertionSort(input);
        int[] selectionResult = SortingAlgorithms.selectionSort(input);
        int[] quickResult = SortingAlgorithms.quickSort(input);
        int[] mergeResult = SortingAlgorithms.mergeSort(input);

        assertArrayEquals(bubbleResult, insertionResult);
        assertArrayEquals(insertionResult, selectionResult);
        assertArrayEquals(selectionResult, quickResult);
        assertArrayEquals(quickResult, mergeResult);
    }
}
