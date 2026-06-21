package com.prateek.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class SearchingAlgorithmsTest {

    @Test
    @DisplayName("LinearSearch - finds element present in array")
    void linearSearchFindsElement() {
        int[] arr = {5, 3, 6, 1, 4, 2};
        assertEquals(2, SearchingAlgorithms.linearSearch(arr, 6));
    }

    @Test
    @DisplayName("LinearSearch - returns -1 when element not found")
    void linearSearchElementNotFound() {
        int[] arr = {5, 3, 6, 1, 4, 2};
        assertEquals(-1, SearchingAlgorithms.linearSearch(arr, 9));
    }

    @Test
    @DisplayName("LinearSearch - finds first occurrence")
    void linearSearchFindsFirstOccurrence() {
        int[] arr = {1, 2, 3, 2, 5};
        assertEquals(1, SearchingAlgorithms.linearSearch(arr, 2));
    }

    @Test
    @DisplayName("LinearSearch - finds element at beginning")
    void linearSearchFindAtStart() {
        int[] arr = {10, 20, 30};
        assertEquals(0, SearchingAlgorithms.linearSearch(arr, 10));
    }

    @Test
    @DisplayName("LinearSearch - finds element at end")
    void linearSearchFindAtEnd() {
        int[] arr = {10, 20, 30};
        assertEquals(2, SearchingAlgorithms.linearSearch(arr, 30));
    }

    @Test
    @DisplayName("LinearSearch - empty array returns -1")
    void linearSearchEmptyArray() {
        int[] arr = {};
        assertEquals(-1, SearchingAlgorithms.linearSearch(arr, 5));
    }

    @Test
    @DisplayName("BinarySearch - finds element in sorted array")
    void binarySearchFindsElement() {
        int[] arr = {2, 4, 5, 7, 8, 9};
        assertEquals(3, SearchingAlgorithms.binarySearch(arr, 7));
    }

    @Test
    @DisplayName("BinarySearch - returns -1 when element not found")
    void binarySearchElementNotFound() {
        int[] arr = {2, 4, 5, 7, 8, 9};
        assertEquals(-1, SearchingAlgorithms.binarySearch(arr, 1));
    }

    @Test
    @DisplayName("BinarySearch - finds first element")
    void binarySearchFindFirst() {
        int[] arr = {2, 4, 5, 7, 8, 9};
        assertEquals(0, SearchingAlgorithms.binarySearch(arr, 2));
    }

    @Test
    @DisplayName("BinarySearch - finds last element")
    void binarySearchFindLast() {
        int[] arr = {2, 4, 5, 7, 8, 9};
        assertEquals(5, SearchingAlgorithms.binarySearch(arr, 9));
    }

    @Test
    @DisplayName("BinarySearch - finds middle element")
    void binarySearchFindMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, SearchingAlgorithms.binarySearch(arr, 5));
    }

    @Test
    @DisplayName("BinarySearch - single element array found")
    void binarySearchSingleElementFound() {
        int[] arr = {5};
        assertEquals(0, SearchingAlgorithms.binarySearch(arr, 5));
    }

    @Test
    @DisplayName("BinarySearch - single element array not found")
    void binarySearchSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, SearchingAlgorithms.binarySearch(arr, 3));
    }

    @Test
    @DisplayName("BinarySearch - element not in range")
    void binarySearchElementBeyondRange() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(-1, SearchingAlgorithms.binarySearch(arr, 12));
    }
}
