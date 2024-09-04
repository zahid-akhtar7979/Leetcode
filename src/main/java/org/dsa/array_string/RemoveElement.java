package org.dsa.array_string;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int firstIndex = 0;
        int lastIndex = nums.length-1;

        while(firstIndex <= lastIndex){
            while(lastIndex >= 0 && nums[lastIndex] == val){
                lastIndex--;
            }
            if(firstIndex <= lastIndex){
                if(nums[firstIndex] == val){
                    int temp = nums[firstIndex];
                    nums[firstIndex] = nums[lastIndex];
                    nums[lastIndex] = temp;
                    lastIndex--;
                }
                firstIndex++;
            }
        }
        return firstIndex;
    }

    public int removeElementOptimised(int[] nums, int val) {
        int index = 0; // This will keep track of the position for non-val elements

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to the value to be removed
            if (nums[i] != val) {
                nums[index] = nums[i]; // Place it at the 'index' position
                index++; // Move to the next position
            }
        }

        return index; // The new length of the array with elements != val
    }
}
