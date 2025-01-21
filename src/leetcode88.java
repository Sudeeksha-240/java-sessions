public class leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize the pointers
        int p1 = 0, p2 = 0, p3 = 0;
        
        // Create a temporary array to store merged result
        int[] arr = new int[m + n];
        
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                arr[p3++] = nums1[p1++];
            } else {
                arr[p3++] = nums2[p2++];
            }
        }
        
        // If there are remaining elements in nums1
        while (p1 < m) {
            arr[p3++] = nums1[p1++];
        }
        
        // If there are remaining elements in nums2
        while (p2 < n) {
            arr[p3++] = nums2[p2++];
        }
        
        // Copy the merged array back into nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = arr[x];
        }
    }
}