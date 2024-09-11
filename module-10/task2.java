public static int findMin(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while (low < high) {
        int mid = low + (high - low) / 2; // Calculate the middle index
        
        if (nums[mid] > nums[high]) { // Minimum is in the right part
            low = mid + 1;
        } else { // Minimum is in the left part or at mid
            high = mid;
        }
    }

    return nums[low]; // The minimum element
}