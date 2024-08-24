class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        // Ensure a is the smaller array
        if (a.length > b.length) {
            return findMedianSortedArrays(b, a);
        }

        int m = a.length;
        int n = b.length;
        int low = 0, high = m;

        while (low <= high) {
            int partA = (low + high) / 2;
            int partB = (m + n + 1) / 2 - partA;

            int leftA = (partA == 0) ? Integer.MIN_VALUE : a[partA - 1];
            int rightA = (partA == m) ? Integer.MAX_VALUE : a[partA];

            int leftB = (partB == 0) ? Integer.MIN_VALUE : b[partB - 1];
            int rightB = (partB == n) ? Integer.MAX_VALUE : b[partB];

            if (leftA <= rightB && leftB <= rightA) {
                // Found the correct partition
                if ((m + n) % 2 == 0) {
                    return ((double)Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2;
                } else {
                    return (double)Math.max(leftA, leftB);
                }
            } else if (leftA > rightB) {
                // Move left in a
                high = partA - 1;
            } else {
                // Move right in a
                low = partA + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}


/*
My Proposed Solution :

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        int size = m + n;
        int[] marr = new int[size];

        

        while(i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                marr[k++] = nums1[i++];
            } else {
                marr[k++] = nums2[j++];
            }
        }

        while (i < m) {
            marr[k++] = nums1[i++];
        }

        while (j < n) {
            marr[k++] = nums2[j++];
        }
        
        if (size % 2 == 0) {
            return (marr[size / 2 - 1] + marr[size / 2]) / 2.0;
        } else {
            return marr[size / 2];
        }
    }
}
 */