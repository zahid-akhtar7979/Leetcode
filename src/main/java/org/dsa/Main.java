package org.dsa;

import org.dsa.array_string.MergeSortedArray;

public class Main {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int []nums1 = {3,4,5,6,0,0};
        int []nums2 = {1,2};
        mergeSortedArray.merge(nums1,4,nums2,2);
    }
}