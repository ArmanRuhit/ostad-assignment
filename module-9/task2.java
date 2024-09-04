public class task2 {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;

        mergeArr(nums1, m, nums2, n);

        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    /**
     * Merges two sorted arrays nums1 and nums2 into nums1 in sorted order.
     * 
     * Time Complexity: O(m + n)
     * - The while loops traverse each element in nums1 and nums2 exactly once,
     *   resulting in a linear time complexity proportional to the sum of the lengths of both arrays.
     * 
     * Space Complexity: O(m + n)
     * - A temporary array 'temp' of size (m + n) is used to store the merged result.
     *   Thus, the auxiliary space complexity is O(m + n).
     */
    public static void mergeArr(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;  // Pointer for nums1
        int j = 0;  // Pointer for nums2
        int[] temp = new int[m + n];  // Temporary array to hold merged elements
        int tempIndex = 0;  // Pointer for temp array

        // Merge the two arrays in sorted order
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[tempIndex] = nums1[i];
                i++;
                tempIndex++;
            } else {
                temp[tempIndex] = nums2[j];
                j++;
                tempIndex++;
            }
        }

        // Copy remaining elements from nums1, if any
        while (i < m) {
            temp[tempIndex] = nums1[i];
            i++;
            tempIndex++;
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            temp[tempIndex] = nums2[j];
            j++;
            tempIndex++;
        }

        // Copy the merged result back into nums1
        i = 0;
        for (int k : temp) {
            nums1[i] = k;
            i++;
        }
    }
}
