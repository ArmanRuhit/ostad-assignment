

/**
 * Finds the kth largest element in the array using merge sort.
 * The array is sorted in descending order, and the kth largest
 * element is returned.
 * 
 * Time Complexity: O(n log n)
 * Space Complexity: O(n) - due to the temporary array used in merge function
 */
public static int kthLargestElement(int[] arr, int k) {
    int low = 0;
    int high = arr.length - 1;

    // Sort the array in descending order using merge sort
    mergeSort(arr, low, high);

    // Return the kth largest element
    return arr[k - 1];
}

/**
 * Performs merge sort on the array to sort it in descending order.
 */
public static void mergeSort(int[] arr, int low, int high) {
    if (low < high) {
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);

        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }
}

/**
 * Merges two halves of the array in descending order.
 */
public static void merge(int[] arr, int low, int mid, int high) {
    int left = low;
    int right = mid + 1;

    // Temporary array to store merged output
    int[] temp = new int[high - low + 1];
    int tempIndex = 0;

    // Merge the two halves in descending order
    while (left <= mid && right <= high) {
        if (arr[left] >= arr[right]) {
            temp[tempIndex] = arr[left];
            tempIndex++;
            left++;
        } else {
            temp[tempIndex] = arr[right];
            tempIndex++;
            right++;
        }
    }

    // Copy remaining elements from the left half
    while (left <= mid) {
        temp[tempIndex] = arr[left];
        tempIndex++;
        left++;
    }

    // Copy remaining elements from the right half
    while (right <= high) {
        temp[tempIndex] = arr[right];
        tempIndex++;
        right++;
    }

    // Copy merged elements back to the original array
    int i = low;
    for (int j : temp) {
        arr[i] = j;
        i++;
    }
}


/*
 * Discussion:
 * 
 * This code solves the problem of finding the kth largest element in an array using the Merge Sort algorithm.
 * 
 * Algorithm Used: Merge Sort
 * 
 * Merge Sort is chosen for this problem because it provides a guaranteed time complexity of O(n log n) 
 * for sorting the entire array. Merge Sort is a stable, comparison-based sorting algorithm that divides the array 
 * into two halves, recursively sorts each half, and then merges the sorted halves back together. 
 * 
 * Why Merge Sort is suitable for this problem:
 * 
 * 1. **Time Complexity**: Merge Sort consistently runs in O(n log n) time, which is efficient for sorting 
 *    large datasets compared to other sorting algorithms like Bubble Sort or Insertion Sort that run in O(n^2) time.
 * 
 * 2. **Stability and Order**: The algorithm sorts the array in descending order as required by modifying the 
 *    comparison in the merge function. Once the array is sorted, accessing the kth element is a constant time operation, O(1).
 * 
 * 3. **Space Complexity**: Although Merge Sort requires additional space for the temporary array during the merge process, 
 *    this is acceptable given the constraint to achieve O(n log n) time complexity. The space complexity is O(n), 
 *    which is the smallest possible for merge-based sorting algorithms.
 * 
 * 4. **No Built-in Functions**: The solution avoids using any built-in sorting functions, as required by the problem statement. 
 *    It implements a custom sorting logic to maintain control over the sorting process.
 * 
 * In summary, Merge Sort is chosen due to its efficient time complexity, stability, and suitability for sorting arrays 
 * in a controlled manner without relying on built-in functions.
 */
