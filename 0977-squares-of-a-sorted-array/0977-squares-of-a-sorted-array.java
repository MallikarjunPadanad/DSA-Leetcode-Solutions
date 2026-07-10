class Solution {
    /**
     * Returns the squares of a sorted (ascending) integer array, also sorted
     * in ascending order.
     *
     * Approach: Two Pointers
     * ------------------------
     * Since the input array is sorted, the largest squared values can only
     * come from the elements furthest from zero — i.e., either the far left
     * (most negative) or far right (most positive) of the array.
     *
     * We compare the squares at both ends and place the larger one at the
     * back of the result array, moving inward. This fills 'ans' from right
     * to left in a single O(n) pass.
     *
     * Time Complexity:  O(n) — each element is visited exactly once.
     * Space Complexity: O(n) — for the output array (required by the problem).
     */
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int writeIndex = n - 1;

        // Fill the result array from the last index to the first.
        while (writeIndex >= 0) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                ans[writeIndex] = leftSquare;
                left++;
            } else {
                ans[writeIndex] = rightSquare;
                right--;
            }

            writeIndex--;
        }

        return ans;
    }
}